package com.emresahna;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.IOException;
import java.nio.file.Paths;

public class GenerateQrApplication
{
    public static void main( String[] args ) throws WriterException, IOException {
        String data = "ENTER_DATA_HERE";
        String path = "ABSOLUTE_PATH\\QRCode.jpg";

        BitMatrix bitMatrix = new MultiFormatWriter()
                .encode(data, BarcodeFormat.QR_CODE, 200, 200);

        MatrixToImageWriter.writeToPath(bitMatrix, "jpg", Paths.get(path));
    }
}
