# A spike into Jackson JSR310 deserialisation in Spring Boot

On my current work project, I noticed that Spring Boot was implicitly translating non UTC specified dates within requests to their UTC equivalent. Although this works for the project, it was a little surprising so I put together this spike to investigate why. 

Commits up to [#2e9f0dae2447381d6bc54d66ab45ceb445deb036](https://github.com/paulspencerwilliams/springbootdatedeserialisation/commit/2e9f0dae2447381d6bc54d66ab45ceb445deb036) replicate the problem. [#4b0d34520fa965f5e63e0c84349a61c6ccfbbe7f](https://github.com/paulspencerwilliams/springbootdatedeserialisation/commit/4b0d34520fa965f5e63e0c84349a61c6ccfbbe7f) resolves the issue as advised in [this issue](https://github.com/spring-projects/spring-boot/issues/5513).
