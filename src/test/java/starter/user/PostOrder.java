package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PostOrder {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoints order")
    public String iSetPOSTApiEndpointsOrder(){
        return url + "orders";
    }
    @Step("I send POST HTTP request")
    public void iSendPOSTHTTPRequest(){
        String body = "[\n" +
                "    {\n" +
                "        \"product_id\":2,\n" +
                "        \"quantity\":1\n" +
                "    }\n" +
                "]";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetPOSTApiEndpointsOrder());
    }
    @Step("I receive valid HTTP response code 200")
    public void iReceive1ValidHTTPResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for new order")
    public void iReceiveValidDataForNewOrder(){
        restAssuredThat(response -> response.body("data[0].quantity", equalTo(1)));
    }
}
