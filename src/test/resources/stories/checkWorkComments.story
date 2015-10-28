Searching by keyword

Meta:
@tag product:comments

Narrative:
 As a User
 I want to be able to proceed reading of comments
 So that I have convenient output

Scenario 1:
Given I am a User browsing comments
When I click "load more"
Then not more then new 5 comments appear

Scenario 2:
Given I am a User browsing comments
And no more comments available
When I am going to load new comments
Then "Load more" button is displayed in disable mode