[![Version](https://img.shields.io/static/v1?label=duui-transformers-topic&message=0.1.3&color=blue)](https://docker.texttechnologylab.org/v2/duui-transformers-topic/tags/list)
[![Version](https://img.shields.io/static/v1?label=Python&message=3.8&color=green)]()
[![Version](https://img.shields.io/static/v1?label=Transformers&message=4.22.1&color=yellow)]()
[![Version](https://img.shields.io/static/v1?label=Torch&message=2.1.1&color=red)]()

# Transformers Topic

DUUI implementation for selected Hugging-Face-based transformer [Topic tools](https://huggingface.co/models?sort=trending&search=topic) models.
## Included Models

| Name                                                   | Revision                                  | Languages                              |
|--------------------------------------------------------|-------------------------------------------|----------------------------------------|
| cardiffnlp/tweet-topic-latest-multi      | 508b2b9e4bf7fd4c71abf685b3b0792fbba63428  | EN                                     |
| classla/xlm-roberta-base-multilingual-text-genre-classifier   | 9b8116e365c9d27f3a1f18f974bdf077ae844658  | Multilingual                           |
| chkla/parlbert-topic-german       | 61b1b398e5862b087a2bf8db8e9e77f8722e1589 | DE                                     |
| ssharoff/genres           | dc9cb7ef031abc96081d9ea96aa0e2ee1636ce04 | EN |
# How To Use

For using duui-transformers-topic as a DUUI image it is necessary to use the [Docker Unified UIMA Interface (DUUI)](https://github.com/texttechnologylab/DockerUnifiedUIMAInterface).

## Start Docker container

```
docker run --rm -p 1000:9714 docker.texttechnologylab.org/duui-transformers-topic:latest
```

Find all available image tags here: https://docker.texttechnologylab.org/v2/duui-transformers-topic/tags/list

## Run within DUUI

```
composer.add(
    new DUUIDockerDriver.Component("docker.texttechnologylab.org/duui-transformers-topic:latest")
        .withScale(iWorkers)
        .withImageFetching()
);
```

### Parameters

| Name | Description |
| ---- | ----------- |
| `model_name` | Model to use, see table above |
| `selection`  | Use `text` to process the full document text or any selectable UIMA type class name |

# Cite

If you want to use the DUUI image please quote this as follows:

Alexander Leonhardt, Giuseppe Abrami, Daniel Baumartz and Alexander Mehler. (2023). "Unlocking the Heterogeneous Landscape of Big Data NLP with DUUI." Findings of the Association for Computational Linguistics: EMNLP 2023, 385–399. [[LINK](https://aclanthology.org/2023.findings-emnlp.29)] [[PDF](https://aclanthology.org/2023.findings-emnlp.29.pdf)] 

## BibTeX

```
@inproceedings{Leonhardt:et:al:2023,
  title     = {Unlocking the Heterogeneous Landscape of Big Data {NLP} with {DUUI}},
  author    = {Leonhardt, Alexander and Abrami, Giuseppe and Baumartz, Daniel and Mehler, Alexander},
  editor    = {Bouamor, Houda and Pino, Juan and Bali, Kalika},
  booktitle = {Findings of the Association for Computational Linguistics: EMNLP 2023},
  year      = {2023},
  address   = {Singapore},
  publisher = {Association for Computational Linguistics},
  url       = {https://aclanthology.org/2023.findings-emnlp.29},
  pages     = {385--399},
  pdf       = {https://aclanthology.org/2023.findings-emnlp.29.pdf},
  abstract  = {Automatic analysis of large corpora is a complex task, especially
               in terms of time efficiency. This complexity is increased by the
               fact that flexible, extensible text analysis requires the continuous
               integration of ever new tools. Since there are no adequate frameworks
               for these purposes in the field of NLP, and especially in the
               context of UIMA, that are not outdated or unusable for security
               reasons, we present a new approach to address the latter task:
               Docker Unified UIMA Interface (DUUI), a scalable, flexible, lightweight,
               and feature-rich framework for automatic distributed analysis
               of text corpora that leverages Big Data experience and virtualization
               with Docker. We evaluate DUUI{'}s communication approach against
               a state-of-the-art approach and demonstrate its outstanding behavior
               in terms of time efficiency, enabling the analysis of big text
               data.}
}

@misc{Bagci:2024,
  author         = {Bagci, Mevlüt},
  title          = {Hugging-Face-based topic models as {DUUI} component},
  year           = {2023},
  howpublished   = {https://github.com/texttechnologylab/duui-uima/tree/main/duui-transformers-topic}
}

```
