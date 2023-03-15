package com.emresahna;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.UUID;

public class GenerateQrWithPOJOApplication {
    public static void main(String[] args) throws WriterException, IOException {
        String sellerId = UUID.randomUUID().toString();
        String path = String.format("C:\\Users\\user\\Desktop\\%s_QRCode.jpg", UUID.randomUUID().toString());

        SellerQRDetailsPOJO sellerQRDetailsPOJO = new SellerQRDetailsPOJO(UUID.randomUUID().toString(), sellerId, path);

        StringBuilder sellerDetails = new StringBuilder();
        sellerDetails.append("{").append("\"seller_id\":").append("\"").append(sellerQRDetailsPOJO.getSeller_id()).append("\"").append("}");

        BitMatrix bitMatrix = new MultiFormatWriter().encode(sellerDetails.toString(), BarcodeFormat.QR_CODE, 200, 200);
        MatrixToImageWriter.writeToPath(bitMatrix, "jpg", Paths.get(path));

        System.out.println("id: " + sellerQRDetailsPOJO.getId());
        System.out.println("seller_id: " + sellerQRDetailsPOJO.getSeller_id());
        System.out.println("path: " + sellerQRDetailsPOJO.getPath());
    }
}
