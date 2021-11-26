Feature: To manage user address
Background: User is successfully Logged in 
Given user open "webdriver.chrome.driver" browser with exe "E:\\Testing Support\\chromedriver.exe"
Given user enter url as "https://www.flipkart.com/"
Given click on Cancle Button
Given user Navigate to Login
Given click on MyProfile
Given user enter "8329513161" as username
Given user enter "abc@123" as password
Given Click on Login

Scenario: Manage address functionality
When click on Manage Address
When user click on add a new address
Then enter user "Girija" as a name
Then enter user "8329513161" as a mobile no
Then enter user "411001" as a pincode
Then enter user "Delhigate" as a Locality
Then enter user "Ahmednagar" as a Address
When user select work as address type
Then Click on Save Button
