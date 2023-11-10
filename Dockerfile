# Use an official OpenJDK runtime as a parent image
FROM openjdk:17

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR de tu aplicación a la imagen (asegúrate de que el archivo JAR se encuentre en el mismo directorio que el Dockerfile)
COPY target/ms-sys-finanzas-1.0.0.jar .

# Expone el puerto en el que la aplicación escucha (ajusta el número de puerto según tu aplicación)
EXPOSE 8080

# Define el comando para ejecutar tu aplicación
CMD ["java", "-jar", "ms-sys-finanzas-1.0.0.jar"]