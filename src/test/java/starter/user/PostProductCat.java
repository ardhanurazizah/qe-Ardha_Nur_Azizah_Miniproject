package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PostProductCat {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoints product category")
    public String iSetPOSTApiEndpointsProductCategory(){
        return url + "categories";
    }
    @Step("I send POST HTTP request")
    public void iSendPOSTHTTPRequest(){
        String body = "{\n" +
                "    \"name\":\"gaming\",\n" +
                "    \"description\":\"for gaming purposes\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetPOSTApiEndpointsProductCategory());
    }
    @Step("I receive valid HTTP response code 200")
    public void iReceive1ValidHTTPResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for rating")
    public void iReceiveValidDataForRating(){
        restAssuredThat(response -> response.body("data[0].Name", equalTo("gaming")));
    }
}
