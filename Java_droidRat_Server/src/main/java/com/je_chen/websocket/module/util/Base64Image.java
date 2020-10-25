package com.je_chen.websocket.module.util;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;


public class Base64Image {

    public String image_To_Base64String(BufferedImage image,String type){
        String imageBase64 = null;
        ByteArrayOutputStream imageByteStream = new ByteArrayOutputStream();
        try {
            ImageIO.write(image,type,imageByteStream);
            byte[] imageByte = imageByteStream.toByteArray();
            imageBase64 = Base64.getEncoder().encodeToString(imageByte);
            imageByteStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return imageBase64;
    }

    public BufferedImage base64String_To_Image(String base64String){
        BufferedImage imageBase64 = null;
        byte[] imageByte;
        try {
            imageByte = Base64.getDecoder().decode(base64String);
            ByteArrayInputStream imageByteStream = new ByteArrayInputStream(imageByte);
            imageBase64 = ImageIO.read(imageByteStream);
            imageByteStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return imageBase64;
    }

}
