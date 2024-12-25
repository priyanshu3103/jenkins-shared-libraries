def deploy(){
  sh "docker-compose down && docker-compose up -d"
  echo "Application deployed successfully"
}
