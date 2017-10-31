package ru.auto.core.blocks.googlesearch;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Image;
import ru.yandex.qatools.htmlelements.element.Link;

import java.util.List;

@Name("Images")
@FindBy (xpath = "//*[@id='isr_mc']")
public class ImagesBlock extends HtmlElement {

    @Name("Результат поиска")
    @FindBy (xpath = ".//img")
    public List<Image> images;
}

