# Proyecto de POO

## Código del diagrama de clases 
Se puede pegar en cualquier generador de diagramas de clases como PlantUML.
```
classDiagram

class Device{
<<abstract>>
-serial: String
-brand: String
-model: String
-operatingSystem: String
-memoryGB: String
}

class Technician{
-name: String
-lastName: String
-idTech: String
-speciality: String
-phoneNumber: String
}

class Laptop{
-type: String
}

class Phone{
-serviceProvider: String
}

class RepairOrder{
-idOrder: String
-ownerName: String
-device: Device
-diagnosis: Diagnosis
-technician: Technician
-status: enum
-price: double
}

class Diagnosis{
-technicalIssue: String
-description: String
}

Device <|-- Laptop
Device <|-- Phone

RepairOrder "1" *-- "0..1" Diagnosis
RepairOrder "1" o-- "1" Device
RepairOrder "0..*" --> "0..1" Technician
```