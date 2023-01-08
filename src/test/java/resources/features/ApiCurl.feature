Feature: I have no auth. Just copied curl to postman
  will assert some headers to get status code 200
 @Api
  Scenario: go to medidata.com,
    click on network to
    copy curl for demo purpose

    Given that I sent request to endpoint
    When assert some headers
    Then get status 200
