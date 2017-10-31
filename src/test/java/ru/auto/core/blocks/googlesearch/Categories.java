package ru.auto.core.blocks.googlesearch;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

import java.util.List;

@Name("Категории")
@FindBy (xpath = "//div[@id= 'hdtb-msb']")
public class Categories extends HtmlElement {

}

