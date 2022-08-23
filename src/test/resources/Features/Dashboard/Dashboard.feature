#Feature: Dashboard
#
  #Scenario: Step_14_As a user i validate logout
    #Given Visit the app url
    #When I see login page title
    #And I enter username
    #And I enter password
    #Then I click on login button
    #And I see atlas main page
    #And I see dashboard grid
    #Then I click logout on menu under user menu hove
    #
    #Scenario: Step_15_As a user i check the menu items after the successful login
    #Given Visit the app url
    #When I see login page title
    #And I enter username
    #And I enter password
    #Then I click on login button
    #And I see atlas main page
    #And I see dashboard grid
    #And I see the right menu items are enabled
    #
  #Scenario: Step_17_As a user i check for tabs that are  visible on the dashboard grid
    #Given Visit the app url
    #When I see login page title
    #And I enter username
    #And I enter password
    #Then I click on login button
    #And I see atlas main page
    #And I see dashboard grid
    #And I see licenses grid
    #Then I see activities grid
    #And I see tasks grid
    #Then I see documents grid
    #Then I click on dashboard grid
    #And I see upcoming renewals Label
    #And I see expiring documents Label
    #And I see tasks Label
    #And I see license details Label
    #And I see USA map
    #And I see client label and default value all
    #And I see company label and default value all
    #And I see facility label and default value all
    #Then I see grid available on toolbar and showing correct data in each visual
    #
    #Scenario: Step_18_As a user i select client, company facility value in a drop-down
    #Given Visit the app url
    #When I see login page title
    #And I enter username
    #And I enter password
    #Then I click on login button
    #And I see atlas main page
    #And I see dashboard grid
    #Then I Select Client, Company Facility value in a dropdown
    #And I see filter to revert client, company, facility to all
    #Then I click active license kpi
    #And I see kpi reflects in grid
    #
#
  #Scenario: Step_16_As a user i check for dashboard load conditions after the successful login
    #Given Visit the app url
    #When I see login page title
    #And I enter username
    #And I enter password
    #Then I click on login button
    #And I see atlas main page
    #And I see dashboard grid
    #And I see licenses grid
    #Then I see activities grid
    #And I see tasks grid
    #Then I see documents grid
    #Then I click on dashboard grid
    #And I see upcoming renewals Label
    #And I see expiring documents Label
    #And I see tasks Label
    #And I see license details Label
    #And I see USA map
    #And I see client label and default value all
    #And I see company label and default value all
    #And I see facility label and default value all
    #Then I see grid available on toolbar and showing correct data in each visual
    #
    #Scenario: Step_19_As a user i on the dashboard grids double click on a License
    #Given Visit the app url
    #When I see login page title
    #And I enter username
    #And I enter password
    #Then I click on login button
    #And I see atlas main page
    #Then I click on dashboard grid
    #And I double click on license detials
    #And I see license Page Title
    #Then I see license detials data on license page
    #
    #Scenario: Step_20_As a user on the kpi i double click on a Tasks Incomplete and verify Incomplete status on license page
    #Given Visit the app url
    #When I see login page title
    #And I enter username
    #And I enter password
    #Then I click on login button
    #And I click on session popup cancel button
    #Then I double click on kpi task all incomplete option
    #And I see tasks page title
    #And I see only the incomplete licenses for the selected global filter values should be shown in the grid
    #
    #Scenario: Step_21_As a user i double click on a Document Expiring kpi value and the document detail opens on the document grid
    #Given Visit the app url
    #When I see login page title
    #And I enter username
    #And I enter password
    #Then I click on login button
    #And I click on session popup cancel button
    #Then I select client from filter options and verify expiring document on kpi
    #Then I double click on kpi expiring documents expired option
    #And I see only the expiring licenses on document grid
    #And I see Number of rows in the grid should match the kpi value in the dashboard
    #
    #
    #Scenario: Step_30_validate delete license feature
    #Given Visit the app url
    #When I see login page title
    #And I enter username
    #And I enter password
    #Then I click on login button
    #And I click on session popup cancel button
    #Then I click on license navigaiton
    #And I double click on license detail
    #And I click on delete button
    #And I see the activites under selected license
    #And I see the task under selected license
    #And I see the license documents under selected license
    #And I see the task documents under selected license
    #And I see the task notification under selected license
    #Then I click on confirm button on delete popup
    #And I see the license details records deleted successfully
    #And I double click on license detail
    #And I click on delete button
    #Then I click on cancel button on delete popup
    #And I see the license details records not deleted
#
        