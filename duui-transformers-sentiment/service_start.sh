TEXTIMAGER_DUUI_TRANSFORMERS_SENTIMENT_ANNOTATOR_NAME="textimager-duui-transformers-sentiment" \
TEXTIMAGER_DUUI_TRANSFORMERS_SENTIMENT_ANNOTATOR_VERSION="unset" \
TEXTIMAGER_DUUI_TRANSFORMERS_SENTIMENT_LOG_LEVEL="DEBUG" \
TEXTIMAGER_DUUI_TRANSFORMERS_SENTIMENT_MODEL_CACHE_SIZE="1" \
uvicorn src.main.python.textimager_duui_transformers_sentiment:app --host 0.0.0.0 --port 9714 --workers 1
