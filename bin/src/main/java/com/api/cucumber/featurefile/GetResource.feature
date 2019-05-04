Feature: Get Resource

  Scenario Outline: Get a Resource
    Given For a given resoure "<name>" and "<id>"
    And Prepare query param  "<content_format>"
    And Prepare path param "<endpoint_id>"
    When Send GET a resource to Client
    Then Receive Response Code "<response_code>"
    And Parse Response Text for "<body_failure>"

    Examples: 
      | name    | id         | content_format | endpoint_id           | response_code | body_failure |
      | UL_DATA | /10250/0/0 | JSON           | {item to be injected} |           200 | failure      |
      | DL_DATA | /10250/0/1 | JSON           | {item to be injected} |           200 | failure      |
