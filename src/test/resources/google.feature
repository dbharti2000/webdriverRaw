Feature: test


    @hotelBooking
    Scenario: Validate homepage
        Given I navigate to elsevier homepage
        When I check the title
        Then I should get the title ""