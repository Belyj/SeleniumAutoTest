package ru.auto.core.blocks.googlesearch;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

import java.util.List;

@Name("Links")
@FindBy (xpath = "//div[@id = 'center_col']")
public class LinksBlock extends HtmlElement {

    @Name("Результат поиска")
    @FindBy (xpath = ".//h3//a")
    public List<Link> results;


}

