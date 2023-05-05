Feature: User
  As admin
  I want to see a list of all available data
  So that I can process the data

  #  ============================Product============================
  Scenario: GET - As admin I can get all product data
    Given I set GET api endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for all products

  @GetProductID
  Scenario: GET - As admin I can get one detail product data
    Given I set GET api endpoints by Id
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for one detail product

  Scenario: GET - As admin I can get product ratings
    Given I set GET api endpoints product ratings
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for product ratings

  Scenario: GET - As admin I can get product comments
    Given I set GET api endpoints product comments
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for product comments

  Scenario: DELETE - As admin I have be able to delete product
    Given I set DELETE api endpoints product
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 200
#batas
  @PostProduct
  Scenario: POST - As admin I have be able to create new product
    Given I set POST api endpoints login
    When I send POST HTTP request login
    And I set POST api endpoints product
    And I send POST HTTP request post product
    Then I receive valid login and product HTTP response code 200
    And I receive valid data for new product

#  Scenario: POST - As admin I have be able to assign product rating
#    Given I set POST api endpoints rating
#    When I send POST HTTP request
#    Then I receive valid HTTP response code 200
#    And I receive valid data for rating

#  Scenario: POST - As admin I have be able to create comment for product
#    Given I set POST api endpoints comment
#    When I send POST HTTP request
#    Then I receive valid HTTP response code 200
#    And I receive valid data for comment

  #  ============================Product Categories============================
  @ProductCatID
  Scenario: GET - As admin I can get category by ID
    Given I set GET api endpoints category Id
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for category by ID

  Scenario: GET - As admin I can get all categories
    Given I set GET api endpoints all categories
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for all categories

  Scenario: DELETE - As admin I have be able to delete product categories
    Given I set DELETE api endpoints product categories
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 200

#  Scenario: POST - As admin I have be able to create new product categories
#    Given I set POST api endpoints product category
#    When I send POST HTTP request
#    Then I receive valid HTTP response code 200
#    And I receive valid data for new product category

  #  ============================Authentication============================
  Scenario: GET - As admin I can get user information
    Given I set GET api endpoints user information
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for user information

#  Scenario: POST - As admin I have be able to create register
#    Given I set POST api endpoints register
#    When I send POST HTTP request
#    Then I receive valid HTTP response code 200
#    And I receive valid data for register

  @Login
  Scenario: POST - As admin I have be able to create login
    Given I set POST api endpoints login
    When I send POST HTTP request login
    Then I receive valid HTTP response code 200
    And I receive valid data for login

  #  ============================Hello============================
  Scenario: GET - As admin I can get index
    Given I set GET api endpoints index
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for index

  #  ============================Orders============================
  Scenario: GET - As admin I can get all orders
    Given I set GET api endpoints all orders
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for all orders

#  Scenario: GET - As admin I can get order by ID
#    Given I set GET api endpoints order Id
#    When I send GET HTTP request
#    Then I receive valid HTTP response code 200
#    And I receive valid data for order by ID

#  Scenario: POST - As admin I have be able to create new order
#    Given I set POST api endpoints order
#    When I send POST HTTP request
#    Then I receive valid HTTP response code 200
#    And I receive valid data for new order