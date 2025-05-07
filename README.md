# Mnemosyne-Profiles

**Mnemosyne-Profiles** is a minimal Spring Boot project demonstrating how to use **Spring Profiles** to manage environment-specific configurations and bean initialization. 

This project shows how you can define separate settings for environments like `dev`, `staging`, and `prod`, and how to create beans that are only loaded for specific profiles. 
Key features:
- Profile-based configuration using `application-{profile}.yml`
- Conditional bean registration with `@Profile`
- Console output to verify which profile is active
