package ru.auto.core.pages.googlesearch;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import com.sun.org.apache.xml.internal.security.Init;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLElement;
import ru.auto.core.blocks.yandexmarket.HeaderBlock;
import ru.sbtqa.tag.pagefactory.Page;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

import java.util.List;
import java.util.Optional;

@PageEntry(title = "Google")
public class Google extends Page {

    public Google() {
        PageFactory.initElements(
                new HtmlElementDecorator(new HtmlElementLocatorFactory(PageFactory.getDriver())), this);
    }

    @ElementTitle("Input")
    @FindBy(xpath = "//*[@id='lst-ib']")
    public TextInput input;

    @ActionTitle("Вводим в строку поиска слово")
    public void searching(String word) throws InterruptedException {
        input.sendKeys(word);
        pressKey("Enter");
    }
}