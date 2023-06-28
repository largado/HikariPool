pipeline {
    agent any

    stages {
        stage ('Construindo Imagem') {
            steps {
                script{
                    dockerapp = docker.build("avena/hikari-pool", '-f ./src/Dockerfile ./')
                }
                echo 'Imagem construída com suce'
            }
        }
    }
}