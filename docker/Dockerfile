# Usa una imagen base oficial de Jenkins con Java 21
FROM jenkins/jenkins:lts-jdk21

USER root

# Instala herramientas necesarias: Git, Maven, Ant, Node.js (LTS)
RUN apt-get update && apt-get install -y \
    git \
    maven \
    ant \
    curl \
    gnupg \
    ca-certificates \
    && curl -fsSL https://deb.nodesource.com/setup_lts.x | bash - \
    && apt-get install -y nodejs \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

# Verifica las versiones instaladas (opcional)
RUN java -version && \
    mvn -version && \
    ant -version && \
    git --version && \
    node -v && \
    npm -v

# Jenkins corre como usuario 'jenkins' por defecto
USER jenkins

# Expone el puerto del servidor Jenkins
EXPOSE 8080

# El punto de entrada ya lo maneja la imagen base de Jenkins

