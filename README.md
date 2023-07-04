# OpenHuFu: An Open-Sourced Data Federation System

[![codecov](https://codecov.io/gh/BUAA-BDA/OpenHuFu/branch/main/graph/badge.svg?token=QJBEGGNL2P)](https://codecov.io/gh/BUAA-BDA/OpenHuFu)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![Total Lines](https://tokei.rs/b1/github/BUAA-BDA/OpenHuFu?category=lines)](https://github.com/BUAA-BDA/OpenHuFu)

Data isolation has become an obstacle to scale up query processing over big data, since sharing raw data among data owners is often prohibitive due to security concerns. A promising solution is to perform secure queries and analytics over a federation of multiple data owners leveraging techiniques like secure multi-party computation (SMC) and differential privacy, as evidenced by recent work on data federation and federated learning. 

OpenHuFu is an open-sourced system for efficient and secure query processing on a data federation.
It provides flexibility for researchers to quickly implement their algorithms for processing federated queries with SMC techniques, such as secret sharing, garbled circuit and oblivious transfer.
With its help, we can quickly conduct the experimental evaluation and obtain the performance of the designed algorithms over benchmark datasets.

## Compile OpenHuFu from Source Code

### Prerequisites:

- Linux or MacOS
- Java 11
- Maven (version at least 3.5.2)
- C++ (generate TPC-H data)
- Python3 (generate spatial data)
- Git & Git LFS (Git Large File Storage)

### Build OpenHuFu

Run the following commands:

1. Clone OpenHuFu repository:

``` shell
git clone https://github.com/BUAA-BDA/OpenHuFu.git
```

2. Download big files from Git LFS(Large File Storage)

``` shell
cd OpenHuFu
git lfs install --skip-smudge
git lfs pull 
```

3. Build:

``` shell
cd OpenHuFu
bash scripts/build/package.sh
```

OpenHuFu is now installed in `release`

### Notes

If you use MacsOS, you need to add this to `settings.xml`(maven settings file):

``` xml
<profiles>
    <profile>
      <id>macos</id>
      <properties>
        <os.detected.classifier>osx-x86_64</os.detected.classifier>
      </properties>
    </profile>
</profiles>
<activeProfiles>
    <activeProfile>macos</activeProfile>
</activeProfiles>
```

## Data Generation

### Relational data: [TCP-H](https://www.tpc.org/tpch/)

#### How to use it:

```shell
bash scripts/test/extract_tpc_h.sh

cd dataset/TPC-H\ V3.0.1/dbgen
cp makefile.suite makefile
# If you use MacOS, you need to replace '#include <malloc.h>' with #include <sys/malloc.h> in dbgen
make

# Go to the root folder
cd ../../..
# x is the number of database，y is the volume of each database(MB)
bash scripts/test/generateData.sh x y
```

### Spatial data

Spatial sample data: `dataset/newyork-taxi-sample.data`:

#### How to use it

Generate spatial data:

``` shell
pip3 install numpy
python3 scripts/test/genSyntheticData.py databaseNum dataSize [distribution name] [params]
```

The distributions we support and their params are as follow:

| Distribution |        param1        |        param2         |
| :----------: | :------------------: | :-------------------: |
|     uni      | low (default = -1e7) | high (default = 1e7)  |
|     nor      |   mu (default = 0)   | sigma (default = 1e5) |
|     exp      |  mu (default = 5e6)  |                       |

(If needed, you can modify `scripts/test/genSyntheticData.py`)

### Notes
Each table is defined by two files in CSV and SCM format, and the names of the files serve as the actual names of the tables. <br/>
The CSV file contains the column names and the data of the table, while the SCM file contains the column names and column types. The delimiter is used to separate different column fields, and it can be specified in the owner's configuration file.

## Configuration File

### OwnerSide

### UserSide

## Development procedure

1. Develop your algorithms

* Aggregate:

``` java
  class extends com.hufudb.openhufu.owner.implementor.aggregate.OwnerAggregateFunction
  /** 
   *  The class must contains a constructor function with parameters:
   *  (OpenHuFuPlan.Expression agg, Rpc rpc, ExecutorService threadPool, OpenHuFuPlan.TaskInfo taskInfo)
   */ 
```

* Join:

``` java
  class implements com.hufudb.openhufu.owner.implementor.join.OwnerJoin
```

2. Set the algorithm for the query(example in owner.yaml):

``` yaml
openhufu:
    implementor:
      aggregate:
        sum: com.hufudb.openhufu.owner.implementor.aggregate.sum.SecretSharingSum
        count: null
        max: null
        min: null
        avg: null
      join: com.hufudb.openhufu.owner.implementor.join.HashJoin
```
3. Build OpenHuFu
    
    Follow the instructions in Section `Build OpenHuFu` to build the project.


4. Run OpenHuFu

    We provide sample configurations for 3 owners in `release/config` folder. <br/> 
You can use the configuration to run our demo on a single machine, or modify the configuration files to deploy OpenHuFu on multiple machines. <br/>

    Please note that since the configuration files use relative paths, we need to `cd release` before running the command.

    Run demo on a single machine:
    ```shell
    bash owner_all.sh
    ```
    Run OpenHuFu on multiple machines:
    ```shell
    bash owner.sh start ./config/owner{i}.json
    ``` 
    Stop OpeHuFu:
    ```shell
    bash owner.sh stop
    ```

4. Run benchmarks

```shell
bash benchmark.sh
```

5. Evaluating communication cost

Before running benchmarks on OpenHuFu, you can follow the instructions to evaluate communication cost of the query:

* Monitoring the port

``` shell
# run the shell script as root
# 8888 is the port number 
sudo bash scripts/test/network_mmonitor/start.sh 8888
```

* Calculating the communication cost

``` shell
# run the shell script as root
sudo bash scripts/test/network_mmonitor/monitor.sh
```

## Data Query Language

1. Plan
2. Function Call

## Supported Query Types

* Filter
* Projection
* Join
  * equi join
  * theta join
* Cross products
* Aggregate(inc. group-by)
* Limited window aggs
* Distinct
* Sort
* Limit
* Common table expressions
* Spatial Queries:
  * range query
  * range counting
  * knn query
  * distance join
  * knn join

## Evaluation Metrics

* Communication Cost
* Running Time
  * Total Query Time
  * Local Query Time
  * Encryption Time
  * Decryption Time

## Related Work

**If you find OpenHuFu helpful in your research, please consider citing our papers and the bibtex are listed below:**

1. **Hu-Fu: Efficient and Secure Spatial Queries over Data Federation.**
   *Yongxin Tong, Xuchen Pan, Yuxiang Zeng, Yexuan Shi, Chunbo Xue, Zimu Zhou, Xiaofei Zhang, Lei Chen, Yi Xu, Ke Xu, Weifeng Lv.* Proc. VLDB Endow. 15(6): 1159-1172 (2022). \[[paper](https://www.vldb.org/pvldb/vol15/p1159-tong.pdf)\] \[[slides](http://yongxintong.group/static/paper/2018/VLDB2018_A%20Unified%20Approach%20to%20Route%20Planning%20for%20Shared%20Mobility_Slides.pptx)\] \[[bibtex](https://dblp.org/rec/journals/pvldb/TongPZSXZZCXXL22.html?view=bibtex)\]

**Other helpful related work from our group is listed below:**

1. **Efficient Approximate Range Aggregation Over Large-Scale Spatial Data Federation.**
   *Yexuan Shi, Yongxin Tong, Yuxiang Zeng, Zimu Zhou, Bolin Ding, Lei Chen.* IEEE Trans. Knowl. Data Eng. 35(1): 418-430 (2023). \[[paper](https://hufudb.com/static/paper/2022/TKDE2022_Efficient%20Approximate%20Range%20Aggregation%20over%20Large-scale%20Spatial%20Data%20Federation.pdf)\] \[[bibtex](https://dblp.org/rec/journals/tkde/ShiTZZDC23.html?view=bibtex)\]

2. **Hu-Fu: A Data Federation System for Secure Spatial Queries.**
   *Xuchen Pan, Yongxin Tong, Chunbo Xue, Zimu Zhou, Junping Du, Yuxiang Zeng, Yexuan Shi, Xiaofei Zhang, Lei Chen, Yi Xu, Ke Xu, Weifeng Lv.* Proc. VLDB Endow. 15(12): 3582-3585 (2022). \[[paper](https://www.vldb.org/pvldb/vol15/p3582-tong.pdf)\] \[[bibtex](https://dblp.org/rec/journals/pvldb/PanTXZDZSZCXXL22.html?view=bibtex)\]

3. **Data Source Selection in Federated Learning: A Submodular Optimization Approach.**
   *Ruisheng Zhang, Yansheng Wang, Zimu Zhou, Ziyao Ren, Yongxin Tong, Ke Xu.* DASFAA 2022. \[[paper](https://doi.org/10.1007/978-3-031-00126-0_43)\] \[[bibtex](https://dblp.org/rec/conf/dasfaa/ZhangWZRTX22.html?view=bibtex)\]

4. **Fed-LTD: Towards Cross-Platform Ride Hailing via Federated Learning to Dispatch.**
   *Yansheng Wang, Yongxin Tong, Zimu Zhou, Ziyao Ren, Yi Xu, Guobin Wu, Weifeng Lv.* KDD 2022. \[[paper](https://doi.org/10.1145/3534678.3539047)\] \[[bibtex](https://dblp.org/rec/conf/kdd/WangTZRXWL22.html?view=bibtex)\]

5. **Efficient and Secure Skyline Queries over Vertical Data Federation.**
   *Yuanyuan Zhang, Yexuan Shi, Zimu Zhou, Chunbo Xue, Yi Xu, Ke Xu, Junping Du.* IEEE Trans. Knowl. Data Eng. (2022). \[[paper](https://doi.org/10.1109/TKDE.2022.3222415)\] \[[bibtex](https://ieeexplore.ieee.org/document/9950625)\]

6. **Federated Topic Discovery: A Semantic Consistent Approach.**
   *Yexuan Shi, Yongxin Tong, Zhiyang Su, Di Jiang, Zimu Zhou, Wenbin Zhang.* IEEE Intell. Syst. 36(5): 96-103 (2021). \[[paper](https://doi.org/10.1109/MIS.2020.3033459)\] \[[bibtex](https://dblp.org/rec/journals/expert/ShiTSJZZ21.html?view=bibtex)\]

7. **Industrial Federated Topic Modeling.**
   *Di Jiang, Yongxin Tong, Yuanfeng Song, Xueyang Wu, Weiwei Zhao, Jinhua Peng, Rongzhong Lian, Qian Xu, Qiang Yang.* ACM Trans. Intell. Syst. Technol. 12(1): 2:1-2:22 (2021). \[[paper](https://doi.org/10.1145/3418283)\] \[[bibtex](https://dblp.org/rec/journals/tist/JiangTSWZPLXY21.html?view=bibtex)\]

8. **A GDPR-compliant Ecosystem for Speech Recognition with Transfer, Federated, and Evolutionary Learning.**
   *Di Jiang, Conghui Tan, Jinhua Peng, Chaotao Chen, Xueyang Wu, Weiwei Zhao, Yuanfeng Song, Yongxin Tong, Chang Liu, Qian Xu, Qiang Yang, Li Deng.* ACM Trans. Intell. Syst. Technol. 12(3): 30:1-30:19 (2021). \[[paper](https://doi.org/10.1145/3447687)\] \[[bibtex](https://dblp.org/rec/journals/tist/JiangTPCWZSTLXY21.html?view=bibtex)\]

9. **An Efficient Approach for Cross-Silo Federated Learning to Rank.**
   *Yansheng Wang, Yongxin Tong, Dingyuan Shi, Ke Xu.* ICDE 2021. \[[paper](https://doi.org/10.1109/ICDE51399.2021.00102)\] \[[slides](https://hufudb.com/static/paper/2021/ICDE2021_An%20Efficient%20Approach%20for%20Cross-Silo%20Federated%20Learning%20to%20Rank.pptx)\] \[[bibtex](https://dblp.org/rec/conf/icde/WangTS021.html?view=bibtex)\]

10. **Federated Learning in the Lens of Crowdsourcing.**
    *Yongxin Tong, Yansheng Wang, Dingyuan Shi.* IEEE Data Eng. Bull. 43(3): 26-36 (2020). \[[paper](http://sites.computer.org/debull/A20sept/p26.pdf)\] \[[bibtex](https://dblp.org/rec/journals/debu/TongWS20.html?view=bibtex)\]

11. **Federated Latent Dirichlet Allocation: A Local Differential Privacy Based Framework.**
    *Yansheng Wang, Yongxin Tong, Dingyuan Shi.* AAAI 2020. \[[paper](https://ojs.aaai.org/index.php/AAAI/article/view/6096)\] \[[bibtex](https://dblp.org/rec/conf/aaai/WangTS20.html?view=bibtex)\]

12. **Federated Acoustic Model Optimization for Automatic Speech Recognition.**
    *Conghui Tan, Di Jiang, Huaxiao Mo, Jinhua Peng, Yongxin Tong, Weiwei Zhao, Chaotao Chen, Rongzhong Lian, Yuanfeng Song, Qian Xu.* DASFAA 2020. \[[paper](https://doi.org/10.1007/978-3-030-59419-0_54)\] \[[bibtex](https://dblp.org/rec/conf/dasfaa/TanJMPTZCLSX20.html?view=bibtex)\]

13. **Efficient and Fair Data Valuation for Horizontal Federated Learning.**
    *Shuyue Wei, Yongxin Tong, Zimu Zhou, Tianshu Song.* Federated Learning 2020. \[[paper](https://doi.org/10.1007/978-3-030-63076-8_10)\] \[[bibtex](https://dblp.org/rec/series/lncs/WeiTZS20.html?view=bibtex)\]

14. **Profit Allocation for Federated Learning.**
    *Tianshu Song, Yongxin Tong, Shuyue Wei.* IEEE BigData 2019. \[[paper](https://doi.org/10.1109/BigData47090.2019.9006327)\] \[[slides](https://hufudb.com/static/paper/2019/BigData2019_Profit%20Allocation%20for%20Federated%20Learning_Slides.pptx)\] \[[bibtex](https://dblp.org/rec/conf/bigdataconf/SongTW19.html?view=bibtex)\]

15. **Federated Machine Learning: Concept and Applications.**
    *Qiang Yang, Yang Liu, Tianjian Chen, Yongxin Tong.* ACM Trans. Intell. Syst. Technol. 10(2): 12:1-12:19 (2019). \[[paper](https://doi.org/10.1145/3298981)\] \[[bibtex](https://dblp.org/rec/journals/tist/YangLCT19.html?view=bibtex)\]
