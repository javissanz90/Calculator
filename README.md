# Calculator

Aplicación para realizar cálculos matemáticos. 

Para poder ejecutor la aplicación es necesario incorporar un JSON con los siguientes atributos: 


{
    "operation": --> Operacion a realizar. Posibles valores: Sum(para sumar) o Subtract(para restar)
    "op1": ---> Operador número 1. Posibles valores: cualquier número
    "op2": ---> Operador número 2. Posibles valores: cualquier número
}


Ejemplo:

{
    "operation": "Sum",
    "op1": 1,
    "op2": 2
}
