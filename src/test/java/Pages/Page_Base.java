package Pages;

import org.openqa.selenium.WebDriver;

public class Page_Base {

    public WebDriver driver;


    public Page_Base(WebDriver driver) {
        this.driver = driver;
    }

    public P1_RegistrationPageElements p1_registrationPageElementsPOM()
    {
        return new P1_RegistrationPageElements(driver);
    }

    public P2_LoginPageElements p2_loginPageElementsPOM()
    {
        return new P2_LoginPageElements(driver);
    }

    public P3_RestPassPageElements p3_restPassPageElementsPOM()
    {
     return new P3_RestPassPageElements(driver);
    }

    public P4_SearchPageElements p4_searchPageElementsPOM()
    {
        return new P4_SearchPageElements(driver);
    }

    public P5_SwitchCurrPageElements p5_switchCurrPageElementsPOM()
    {
        return new P5_SwitchCurrPageElements(driver);
    }

    public P6_CategoriesPageElements p6_categoriesPageElementsPOM()
    {
        return new P6_CategoriesPageElements(driver);
    }

    public P7_FilterColorPageElements p7_filterColorPageElementsPOM()
    {
        return new P7_FilterColorPageElements(driver);
    }

    public P8_SelectTagsPageElements p8_selectTagsPageElementsPOM()
    {
        return new P8_SelectTagsPageElements(driver);
    }

    public P9_CompareListPageElements p9_compareListPageElementsPOM()
    {
        return new P9_CompareListPageElements(driver);
    }

    public P10_WishlistPageElements p10_wishlistPageElementsPOM()
    {
        return new P10_WishlistPageElements(driver);
    }

    public P11_ShoppCartPageElements p11_shoppCartPageElementsPOM()
    {
        return new P11_ShoppCartPageElements(driver);
    }

    public P12_OrderCheckPageElements p12_orderCheckPageElementsPOM()
    {
        return new P12_OrderCheckPageElements(driver);
    }
}
