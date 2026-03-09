package io.depi;
def bulid_image(IMAGE_NAME, IMAGE_TAG){
    sh "docker build -t ${IMAGE_NAME}:${IMAGE_TAG} ."
}

def push_image(IMAGE_NAME, IMAGE_TAG){
    sh "docker push ${IMAGE_NAME}:${IMAGE_TAG}"
}

def login(DOCKER_USERNAME, DOCKER_PASSWORD){
    sh "docker login -u ${DOCKER_USERNAME}:${DOCKER_PASSWORD}"
}