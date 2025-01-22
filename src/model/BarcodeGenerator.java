package model;

import com.google.zxing.*;
import com.google.zxing.common.BitMatrix;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.util.Hashtable;

public class BarcodeGenerator {

    /**
     * Generates a barcode image and sets it as an icon for a JLabel.
     *
     * @param label The JLabel where the barcode will be displayed.
     * @param text The text to encode in the barcode.
     * @param width The width of the barcode image.
     * @param height The height of the barcode image.
     *
     * <li>Author lochana 2005</li>
     * <li>Copyright 2025</li>
     */
    public static BufferedImage generateBarcode(JLabel label, String text, int width, int height) {
        try {

            if (text == null || text.isEmpty()) {
                throw new IllegalArgumentException("Barcode text cannot be null or empty.");
            }

            Hashtable<EncodeHintType, Object> hints = new Hashtable<>();
            hints.put(EncodeHintType.MARGIN, 1);

            BitMatrix bitMatrix = new MultiFormatWriter().encode(
                    text, BarcodeFormat.CODE_128, width, height, hints);

            BufferedImage barcodeImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    barcodeImage.setRGB(x, y, bitMatrix.get(x, y) ? 0x000000 : 0xFFFFFF);
                }
            }

            int totalHeight = height + 30;
            BufferedImage combinedImage = new BufferedImage(width, totalHeight, BufferedImage.TYPE_INT_RGB);

            Graphics2D graphics = combinedImage.createGraphics();
            graphics.setColor(Color.WHITE);
            graphics.fillRect(0, 0, width, totalHeight);

            graphics.drawImage(barcodeImage, 0, 0, null);

            graphics.setColor(Color.BLACK);
            graphics.setFont(new Font("Arial", Font.BOLD, 14));
            FontMetrics fontMetrics = graphics.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int x = (width - textWidth) / 2;
            int y = height + fontMetrics.getHeight();
            graphics.drawString(text, x, y);

            graphics.dispose();

            if (label != null) {
                label.setIcon(new ImageIcon(combinedImage));
            }

            return combinedImage;

        } catch (WriterException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error generating barcode: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }

}
