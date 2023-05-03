package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.*;

public class UserSteps {
//    ============================Product============================
    @Steps
    GetAllProduct allProduct;
    @Given("I set GET api endpoints")
    public void iSetGETApiEndpoints() {
        allProduct.iSetGETApiEndpoints();
    }
    @When("I send GET HTTP request")
    public void iSendGETHTTPRequest() {
        allProduct.iSendGETHTTPRequest();
    }
    @Then("I receive valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode() {
        allProduct.iReceiveValidHTTPResponseCode();
    }
    @And("I receive valid data for all products")
    public void iReceiveValidDataForAllProducts() {
        allProduct.iReceiveValidDataForAllProducts();
    }

    @Steps
    GetProductId productId;
    @Given("I set GET api endpoints by Id")
    public void iSetGETApiEndpointsById() {
        productId.iSetGETApiEndpointsById();
    }
    @And("I receive valid data for one detail product")
    public void iReceiveValidDataForOneDetailProduct() {
        productId.iReceiveValidDataForOneDetailProduct();
    }

    @Steps
    GetProductRatings productRatings;
    @Given("I set GET api endpoints product ratings")
    public void iSetGETApiEndpointsProductRatings() {
        productRatings.iSetGETApiEndpointsProductRatings();
    }
    @And("I receive valid data for product ratings")
    public void iReceiveValidDataForProductRatings() {
        productRatings.iReceiveValidDataForProductRatings();
    }

    @Steps
    GetProductComments productComments;
    @Given("I set GET api endpoints product comments")
    public void iSetGETApiEndpointsProductComments() {
        productComments.iSetGETApiEndpointsProductComments();
    }
    @And("I receive valid data for product comments")
    public void iReceiveValidDataForProductComments() {
        productComments.iReceiveValidDataForProductComments();
    }

    @Steps
    DelProduct delProduct;
    @Given("I set DELETE api endpoints product")
    public void iSetDELETEApiEndpointsProduct() {
        delProduct.iSetDELETEApiEndpointsProduct();
    }

    @When("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest() {
        delProduct.iSendDELETEHTTPRequest();
    }

    @Steps
    PostProduct postProduct;
    @And("I set POST api endpoints product")
    public void iSetPOSTApiEndpointsProduct() {
        postProduct.iSetPOSTApiEndpointsProduct();
    }

    @And("I send POST HTTP request post product")
    public void iSendPOSTHTTPRequestpostproduct() {
        postProduct.iSendPOSTHTTPRequestpostproduct();
    }
    @Then("I receive valid login and product HTTP response code 200")
    public void iReceive1ValidLoginAndProductHTTPResponseCode() { postProduct.iReceive1ValidLoginAndProductHTTPResponseCode();
    }
    @And("I receive valid data for new product")
    public void iReceiveValidDataForNewProduct() {
        postProduct.iReceiveValidDataForNewProduct();
    }

    @Steps
    PostProductRating postProductRating;
    @Given("I set POST api endpoints rating")
    public void iSetPOSTApiEndpointsRating() {
        postProductRating.iSetPOSTApiEndpointsRating();
    }

    @And("I receive valid data for rating")
    public void iReceiveValidDataForRating() {
        postProductRating.iReceiveValidDataForRating();
    }

    @Steps
    PostProductComment postProductComment;
    @Given("I set POST api endpoints comment")
    public void iSetPOSTApiEndpointsComment() {
        postProductComment.iSetPOSTApiEndpointsComment();
    }

    @And("I receive valid data for comment")
    public void iReceiveValidDataForComment() {
        postProductComment.iReceiveValidDataForComment();
    }

    //    ============================Product Category============================
    @Steps
    GetCatId catId;
    @Given("I set GET api endpoints category Id")
    public void iSetGETApiEndpointsCategoryId() {
        catId.iSetGETApiEndpointsCategoryId();
    }
    @And("I receive valid data for category by ID")
    public void iReceiveValidDataForCategoryByID() {
        catId.iReceiveValidDataForCategoryByID();
    }

    @Steps
    GetAllCat allCat;
    @Given("I set GET api endpoints all categories")
    public void iSetGETApiEndpointsAllCategories() {
        allCat.iSetGETApiEndpointsAllCategories();
    }
    @And("I receive valid data for all categories")
    public void iReceiveValidDataForAllCategories() {
        allCat.iReceiveValidDataForAllCategories();
    }

    @Steps
    DelProductCat delProductCat;
    @Given("I set DELETE api endpoints product categories")
    public void iSetDELETEApiEndpointsProductCategories() {
        delProductCat.iSetDELETEApiEndpointsProductCategories();
    }

    @Steps
    PostProductCat postProductCat;
    @Given("I set POST api endpoints product category")
    public void iSetPOSTApiEndpointsProductCategory() {
        postProductCat.iSetPOSTApiEndpointsProductCategory();
    }

    @And("I receive valid data for new product category")
    public void iReceiveValidDataForNewProductCategory() {
        postProductCat.iSetPOSTApiEndpointsProductCategory();
    }

    //    ============================Authentication============================
    @Steps
    GetUser getUser;
    @Given("I set GET api endpoints user information")
    public void iSetGETApiEndpointsUserInformation() {
        getUser.iSetGETApiEndpointsUserInformation();
    }
    @And("I receive valid data for user information")
    public void iReceiveValidDataForUserInformation() {
        getUser.iReceiveValidDataForUserInformation();
    }

    @Steps
    PostRegister postRegister;
    @Given("I set POST api endpoints register")
    public void iSetPOSTApiEndpointsRegister() {
        postRegister.iSetPOSTApiEndpointsRegister();
    }

    @And("I receive valid data for register")
    public void iReceiveValidDataForRegister() {
        postRegister.iReceiveValidDataForRegister();
    }

    @Steps
    PostLogin postLogin;
    @Given("I set POST api endpoints login")
    public void iSetPOSTApiEndpointsLogin() {
        postLogin.iSetPOSTApiEndpointsLogin();
    }
    @And("I send POST HTTP request login")
    public void iSendPOSTHTTPRequestLogin() {
        postLogin.iSendPOSTHTTPRequestLogin();
    }

    @And("I receive valid data for login")
    public void iReceiveValidDataForLogin() {
        postLogin.iReceiveValidDataForLogin();
    }
    //    ============================Hello============================
    @Steps
    GetIndex getIndex;
    @Given("I set GET api endpoints index")
    public void iSetGETApiEndpointsIndex() {
        getIndex.iSetGETApiEndpointsIndex();
    }
    @And("I receive valid data for index")
    public void iReceiveValidDataForIndex() {
        getIndex.iReceiveValidDataForIndex();
    }
    //    ============================Orders============================
    @Steps
    GetAllOrders getAllOrders;
    @Given("I set GET api endpoints all orders")
    public void iSetGETApiEndpointsAllOrders() {
        getAllOrders.iSetGETApiEndpointsAllOrders();
    }
    @And("I receive valid data for all orders")
    public void iReceiveValidDataForAllOrders() {
        getAllOrders.iReceiveValidDataForAllOrders();
    }

    @Steps
    GetOrderId getOrderId;
    @Given("I set GET api endpoints order Id")
    public void iSetGETApiEndpointsOrderId() {
        getOrderId.iSetGETApiEndpointsOrderId();
    }
    @And("I receive valid data for order by ID")
    public void iReceiveValidDataForOrderByID() {
        getOrderId.iReceiveValidDataForOrderByID();
    }

    @Steps
    PostOrder postOrder;
    @Given("I set POST api endpoints order")
    public void iSetPOSTApiEndpointsOrder() {
        postOrder.iSetPOSTApiEndpointsOrder();
    }

    @And("I receive valid data for new order")
    public void iReceiveValidDataForNewOrder() {
        postOrder.iReceiveValidDataForNewOrder();
    }
}
