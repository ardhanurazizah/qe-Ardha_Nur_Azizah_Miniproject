package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PostProductRating {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoints product")
    public String iSetPOSTApiEndpointsRating(){
        return url + "products/2/ratings";
    }
    @Step("I send POST HTTP request")
    public void iSendPOSTHTTPRequest(){
        String body = "{\n" +
                "    \"count\":4\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetPOSTApiEndpointsRating());
    }
    @Step("I receive valid HTTP response code 200")
    public void iReceive1ValidHTTPResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for rating")
    public void iReceiveValidDataForRating(){
        restAssuredThat(response -> response.body("data[0].Name", equalTo("Sony PS5")));
    }
}
