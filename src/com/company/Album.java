package com.company;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Album {

    //Загрузить альбом для просмотра
    public void Load(){}

    //Сохранить альбом в файл
    public void Save(){}

    //Удалить фото с альбома
    public void DeletePhoto(){}

    //Добавить фото в альбом
    public void AddPhoto() throws IOException  {
        File file = new File("");
        BufferedImage img = ImageIO.read(file);

    }

    //Переход к следующему фото
    public void Next(){}

    //Переход к предыдущему фото
    public void Previous(){}

    //Добавление подписи к фото
    public void AddSignature(){}

    //Удаление подписи к фото
    public void DeleteSignature(){}

    //Редактирование подписи к фото
    public void EditSignature(){}

}
