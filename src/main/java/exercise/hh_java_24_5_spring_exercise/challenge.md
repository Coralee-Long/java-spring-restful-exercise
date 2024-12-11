# 4-Spring/2-Spring-Web

## Clarify uncertainties

Which questions remained unanswered from the lecture?
(please only ask questions about understanding the lecture, no further specialized questions)

Please try to clarify these questions as a group.
Feel free to use all possible sources. Everything is allowed. Please use Google, ChatGPT, your friends and acquaintances, your IDE, other websites or books, or whatever.

Once you all have a common understanding of the topic, click on "Next"

## Research

Find answers together for the questions listed here and enter them here.
Be creative! Everything is allowed! Please use Google, ChatGPT, your friends and acquaintances, your IDE, other websites or books, or whatever.

* Why are different HTTP methods (GET, POST, PUT, DELETE) used in a RESTful API and what is their meaning?
  Explain the usage and purpose of each method.
  `inputfield`
* What is the difference between using query parameters and path variables in controller endpoints?
  Give examples of situations where the use of query parameters makes sense, and situations where path variables are more suitable.
  `inputfield`
* When should the request body be used and what advantages does it offer?
  Explain why and when the use of the request body is useful and how it is helpful in data transmission in a RESTful API.
  `inputfield`

## Break

Take a 15-minute break.
Either right now, or (if you were very fast) a little later.

## Coding: HelloWorld Controller

Create a new Spring Boot project in IntelliJ and implement a simple 'HelloWorld' controller.
Use the concepts you have learned, such as annotations, HTTP methods, and path variables.

* Step 1: Create a Spring Boot application using the Spring Initializr and add the spring-web-starter.
* Step 2: Write a controller that handles a GET request to '/api/hello' and returns 'Hello, World!'.

Test your controller method with a REST client or Postman and document your results.

Please post the link to your GitHub repository here, where you created your HelloWorld application.
`inputfield`

## Coding: HelloSomeone Controller

* Step 3: Use path variables to customize the name in the message.
  Example: '/api/hello/John' returns 'Hello, John!'.

Test your controller method with a REST client or Postman and document your results.

* If you have already completed this task earlier, you may work on the bonus task on the next page.

## Bonus: Message Controller (POST)

Great, you have time for the bonus task! Work on these optional additional tasks to further deepen your knowledge.

* Step 1: Create a new class 'Message' with the fields 'name', 'message', and 'id' of type String.
* Step 2: The controller should now have a list of Message objects.
* Step 3: Implement an additional controller method that handles a POST request to '/api/messages'. This method should accept an id, a name, and a message in the request body and store them in the list.

If you are done with this task, continue with the next bonus task on the next page.

## Bonus: Message Controller (GET)

* Step 4: Implement an additional controller method that handles a GET request to '/api/messages'. This method should return the list of messages.

If you are done with this task, continue with the next bonus task on the next page.

## Bonus: Message Controller (DELETE)

* Step 5: Implement an additional controller method that handles a DELETE request to '/api/messages/id'. This method should delete the message with the corresponding id from the list. (use a path variable)