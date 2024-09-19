package keys;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTest extends BaseTest {
    @Test
    public void testHorizontalSlider(){
        try {
            var slider=(HorizontalSliderPage)homePage.openPage("Horizontal Slider");
            slider.moveSlider(7);
            assertEquals(slider.getSliderValue(),"3.5","Incorrect value for slider");
        } catch (Exception e) {
            System.out.println("There is no page for this link text");
            e.printStackTrace();
        }

    }
}
