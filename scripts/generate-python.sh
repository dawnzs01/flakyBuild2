python3.7 -m grpc_tools.protoc \
  -Ibackend/java-app/src/main/proto \
  --python_out=backend/java-app/src/main/python/generated \
  --grpc_python_out=backend/java-app/src/main/python/generated \
  --mypy_out=backend/java-app/src/main/python/generated \
  --mypy_grpc_out=backend/java-app/src/main/python/generated \
  backend/java-app/src/main/proto/ml-worker.proto
#  --mypy_out=backend/java-app/src/main/python/generated \
