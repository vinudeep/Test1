Feature: Simo_Journey_order_placed Ecomm10392



@First
  Scenario: Simo_Journey_order_placed Ecomm10392
      Given I am an eComm user12
      When I choose 'like new' sim free device
      And Land on the 'Tariffs and extra' page
      And I Land on the basket page and click on "go to checkout" button
      And input all the fields on the Delivery page and Click on the 'Continue button'
      And I land on the payment page and input all the details and click 'Continue on next step'
      And perform an End to End operation