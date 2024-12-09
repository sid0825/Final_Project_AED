# Housing Management System
Sumeet Rane
Siddhesh Sawant
Omkar Salian
## Overview
The Housing Management System is an integrated application designed to streamline and manage various operations within a university setting. It encompasses modules for managing business operations, organizational structures, and specialized centers such as Maintenance, Dormitory, Doctor, and Diet Centers. The system supports role-based operations, enabling effective task delegation and seamless user interaction.

## Features

### University Structure

#### University Organization:
- Campus-level settings and configurations.
- Handles overall system configuration for other components.

#### Centers:
- **Maintenance Center**
- **Dormitory Center**
- **Doctor Center**
- **Trainer Center**
- **Diet Center**

#### Organizations:
- **Maintenance Organization**
- **Dormitory Organization**
- **Doctor Organization**
- **Trainer Organization**
- **Diet Organization**

### Teams and Roles

#### Teams:
- **Service Heal Team**
- **Delivery Agent Team**

#### Roles:
- General-Administrative Role
- Weight/Trainer Role
- Nutritionist Role
- Physical Therapist Role
- Fitness Trainer Role
- Additional generic roles for flexibility.

### Functional Modules
- **Employee Directory:** Manage all employees across the organization.
- **User Account Directory:** Centralized authentication and authorization system.
- **Work Orders:** Automate and manage service and maintenance requests effectively.

## Installation

### Clone the Repository:
```bash
git clone https://github.com/your-repo/housing-management.git
```

### Set Up Your Development Environment:
1. Install Java JDK (11 or higher).
2. Configure your IDE (e.g., Eclipse or IntelliJ).
3. Add the necessary libraries:
   - `db4o`
   - `JavaMail API`

### Run the Project:
1. Configure the main class for execution.

## Configuration

### Database
- The system uses **db4o** for object-oriented data storage.
- The database file `Databank.db4o` will be created in the project directory.
- To reset the database, rename or delete the `.db4o` file.

### Email Notifications
- Uses **Gmail SMTP** for automated email notifications.
- Configure your email and generated app password in the `sendEmail` method.

## Usage

### System Initialization
- Configure the initial university and associated settings using the `ConfigureASystem` class.

### Managing Centers and Teams
- Assign employees to specific organizations and roles.
- Use the Admin interface to create, update, and delete records.

### Processing Work Orders
- Work orders are generated dynamically based on user requests and handled by respective teams.

### Health & Fitness Management
- The Diet and Trainer Centers provide custom fitness charts, emailed to users.

---
