# A spike into Jackson JSR310 deserialisation in Spring Boot
On my current work project, I noticed that Spring Boot was implicitly translating non UTC specified dates within requests to their UTC equivalent. Although this works for the project, it was a little suprising so I put together this spike to investigate why. 

Commits upto the penultimate one aim to replicate the problem which was easy. The final commit resolves the issue guided by [this issue](https://github.com/spring-projects/spring-boot/issues/5513).
