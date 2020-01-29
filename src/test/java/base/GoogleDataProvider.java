package base;

import org.testng.annotations.DataProvider;

public class GoogleDataProvider {

    @DataProvider(name = "searchPatternDataProvider")
    public Object[][] getSearchPattern(){
        return new Object[][]{{"CNN"},{"ABC"},{"HBO"},{"Sony"},{"FOX"},{"WB"}};
    }
}
