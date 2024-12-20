def clonning(string url, string branch){
  echo "Clonning the app....."
  git url: "${url}", branch: "${branch}"
  echo "Successfully cloned"
}
