# Why should we use Selenide ?

1. As our project is large and have a couple of modules in every change we should re-compile every module,
Selenide is a library and all needed Selenium configurations are in jar
2. Selenide automatically takes care of browser shutdown, handling timeouts, test debugging, and StaleElement Exception, so you only focus on improving your business logic.
3. Create custom expected condition
4. Use for long actions js
5. Selenide profiler, can found that urls open twice, a lot of time spend to sendKeys method
6. Has a lot of built-in methods
8. Save time on writing tests and debugging (using smart waiting) ( wait up to 4 seconds) on every check.
9. can work with collections and can't wait and filter elements
10. Use Fluent style, allow write readable and concise code
11. Can do screenshot without reporting tools using screenshots and can save screenshot on jenkins by using some env variable
12. Can uploads multiple files
13. custom matchers
14. Can find elements by text because emulate user behaviour
15. Can search by parents
16 can get element attributes
17. Do start and close of browser automatically


Concerns
1. Based on Selenium WebDriver
we can use selenium directly
You can stiil use custom web driver instance
2. Can paralellize
3. Can use to Page Object
4. We aren't restricted

Other typical solutions
1. Implicit wait - can wait element apper but can't wait element dissappear or element change state (unsufficient) 
2. Fluentwait - should think what timeouts should we use
3. works by default

UI Auto-login through the cookies improvement
https://medium.com/@rosolko/boost-you-autotests-with-fast-authorization-b3eee52ecc19

