# My_marvin 🤖

Welcome to `my_marvin`.

This project is centered around harnessing the power of Jenkins, the popular Open Source automation platform, for creating a continuous integration and continuous delivery (CI/CD) pipeline.

## Language and Tools 🛠️

- **Language:** Configuration as Code (YAML, Groovy)
- **Tools:** Jenkins, Jenkins Job DSL, Various Jenkins Plugins
- **Binary Name:** my_marvin

## Project Overview 🔎

The goal is to automate everyday developer tasks using Jenkins.

Jenkins and dynamic CI/CD pipeline using the principles of Configuration as Code (JCasC) and the Job Domain Specific Language (Job DSL).

### Configuration Specifications

- **Global Configuration:** Custom system message, Agent-Master Access Control, and other settings.
- **User Management:** Creation of users with specific roles and permissions, using environment variables for passwords.
- **Authorization Strategy:** Implementing role-based access control with predefined roles like admin, ape, gorilla, and assist.
- **Folders and Tools:** Organize jobs within specified folders and tools.

### Job Specifications

- **clone-repository Job:** Clones a Git repository using a provided URL.
- **SEED Job:** Creates new jobs with specific parameters and triggers.
- **Jobs Created by SEED:** Automated jobs for continuous integration, following specific build and test steps.

### Technical Formalities

- **my_marvin.yml:** The main YAML configuration file for JCasC.
- **job_dsl.groovy:** Centralized DSL script for job creation.
- **Plugin Restrictions:** Only specified Jenkins plugins will be used.

## Installation and Usage 💾

1. Clone the repository.
2. Set up a Jenkins instance with the required plugins.
3. Apply the `my_marvin.yml` configuration to your Jenkins instance.
4. Use `job_dsl.groovy` to create and manage jobs.
5. Test the setup with various repositories and observe the CI/CD pipeline in action.

## License ⚖️

This project is released under the MIT License. See `LICENSE` for more details.
