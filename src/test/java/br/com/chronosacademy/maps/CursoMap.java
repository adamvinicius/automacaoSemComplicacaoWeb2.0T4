package br.com.chronosacademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CursoMap {
    @FindBy(xpath = "//section[4]/div//div/div/div[1]/div/div")
    public WebElement h2Titulo;
}
