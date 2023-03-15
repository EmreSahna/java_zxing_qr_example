package com.emresahna;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadQrApplication {
    public static void main(String[] args) throws IOException, NotFoundException {
        String path = "ABSOLUTE_PATH\\QRCode.jpg";

        BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(ImageIO.read(Files.newInputStream(Paths.get(path))))));

        Result res = new MultiFormatReader().decode(binaryBitmap);

        System.out.println(res.getText());
    }
}
