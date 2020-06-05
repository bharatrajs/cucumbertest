Feature: Navigate to weathermap

Scenario Outline: Navigate to weathermap
Given Runmode is "<Runmode>"

Examples:
| Runmode | Browser | 
|    Y    | Chrome  | 
|    N    | Mozilla |