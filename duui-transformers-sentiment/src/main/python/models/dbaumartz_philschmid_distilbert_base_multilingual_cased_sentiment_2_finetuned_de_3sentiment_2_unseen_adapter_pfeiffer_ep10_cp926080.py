SUPPORTED_MODEL = {
    "dbaumartz/philschmid_distilbert-base-multilingual-cased-sentiment-2-finetuned-de-3sentiment-2-unseen-adapter-pfeiffer-ep10-cp926080": {
        "version": "v1.0_ep10_cp926080",
        "type": "adapter",
        "model_type": "huggingface",
        "model_name": "philschmid/distilbert-base-multilingual-cased-sentiment-2",
        "model_version": "83ff874f93aacbba79642abfe2a274a3c874232b",
        "adapter_type": "local",
        "adapter_path": "/models/dbaumartz/philschmid_distilbert-base-multilingual-cased-sentiment-2-finetuned-de-3sentiment-unseen-adapter-pfeiffer/checkpoint-926080/3sentiment-unseen",
        "max_length": 512,
        "mapping": {
            "positive": 1,
            "neutral": 0,
            "negative": -1
        },
        "3sentiment": {
            "pos": ["positive"],
            "neu": ["neutral"],
            "neg": ["negative"]
        },
        "preprocess": lambda text: text,
        "languages": ["de"]
    },
}
