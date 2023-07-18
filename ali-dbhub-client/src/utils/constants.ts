import mysqlLogo from '@/assets/mysql-logo.png';
import redisLogo from '@/assets/redis-logo.png';
import h2Logo from '@/assets/h2-logo.png';
import moreDBLogo from '@/assets/moreDB-logo.png';
import { IDatabase } from '@/types';

export enum ThemeType {
  default = 'default',
  dark = 'dark',
}

export enum StatusType {
  SUCCESS = 'success',
  FAIL = 'fail',
}

export enum DatabaseTypeCode {
  MYSQL = 'MYSQL',
  ORACLE = 'ORACLE',
  DB2 = 'DB2',
  MONGODB = 'MONGODB',
  REDIS = 'REDIS',
  H2 = 'H2',
  POSTGRESQL = 'POSTGRESQL',
  SQLSERVER = 'SQLSERVER',
  SQLITE = 'SQLITE',
  MARIADB = 'MARIADB',
  CLICKHOUSE = 'CLICKHOUSE',
  DM="DM",
  OCEANBASE="OCEANBASE",
  PRESTO="PRESTO",
  REDIS="REDIS",
  HIVE="HIVE",
  KINGBASE="KINGBASE",
  MONGODB="MONGODB",
}

export const databaseType: {
  [keys: string]: IDatabase;
} = {
  [DatabaseTypeCode.MYSQL]: {
    name: 'MySQL',
    img: mysqlLogo,
    code: DatabaseTypeCode.MYSQL,
    port: 3306,
    icon: '\uec6d',
  },
  [DatabaseTypeCode.H2]: {
    name: 'H2',
    img: h2Logo,
    code: DatabaseTypeCode.H2,
    port: 9092,
    icon: '\ue61c',
  },
  [DatabaseTypeCode.ORACLE]: {
    name: 'Oracle',
    img: moreDBLogo,
    code: DatabaseTypeCode.ORACLE,
    port: 1521,
    icon: '\uec48',
  },
  [DatabaseTypeCode.POSTGRESQL]: {
    name: 'PostgreSql',
    img: moreDBLogo,
    code: DatabaseTypeCode.POSTGRESQL,
    port: 5432,
    icon: '\uec5d',
  },
  [DatabaseTypeCode.SQLSERVER]: {
    name: 'SQLServer',
    img: moreDBLogo,
    code: DatabaseTypeCode.SQLSERVER,
    port: 1521,
    icon: '\ue664',
  },
  [DatabaseTypeCode.SQLITE]: {
    name: 'SQLite',
    img: moreDBLogo,
    code: DatabaseTypeCode.SQLITE,
    port: 5432,
    icon: '\ue65a',
  },
  [DatabaseTypeCode.MARIADB]: {
    name: 'MariaDB',
    img: moreDBLogo,
    code: DatabaseTypeCode.MARIADB,
    port: 3306,
    icon: '\ue6f5',
  },
  [DatabaseTypeCode.CLICKHOUSE]: {
    name: 'ClickHouse',
    img: moreDBLogo,
    code: DatabaseTypeCode.CLICKHOUSE,
    port: 8123,
    icon: '\ue8f4',
  },
  [DatabaseTypeCode.DM]: {
    name: 'DM',
    img: moreDBLogo,
    code: DatabaseTypeCode.DM,
    port: 5236,
    icon: '\ue655',
  },
  [DatabaseTypeCode.PRESTO]: {
    name: 'Presto',
    img: moreDBLogo,
    code: DatabaseTypeCode.PRESTO,
    port: 8080,
    icon: '\ue60b',
  },
  [DatabaseTypeCode.DB2]: {
    name: 'DB2',
    img: moreDBLogo,
    code: DatabaseTypeCode.DB2,
    port: 50000,
    icon: '\ue60a',
  },
  [DatabaseTypeCode.OCEANBASE]: {
    name: 'OceanBase',
    img: moreDBLogo,
    code: DatabaseTypeCode.OCEANBASE,
    port: 2883,
    icon: '\ue982',
  },
  [DatabaseTypeCode.REDIS]: {
    name: 'Redis',
    img: moreDBLogo,
    code: DatabaseTypeCode.REDIS,
    port: 6379,
    icon: '\ue6a2',
  },
  [DatabaseTypeCode.HIVE]: {
    name: 'Hive',
    img: moreDBLogo,
    code: DatabaseTypeCode.HIVE,
    port: 10000,
    icon: '\ue60e',
  },
  [DatabaseTypeCode.KINGBASE]: {
    name: 'KingBase',
    img: moreDBLogo,
    code: DatabaseTypeCode.KINGBASE,
    port: 54321,
    icon: '\ue6a0',
  },
  [DatabaseTypeCode.MONGODB]: {
    name: 'MongoDB',
    img: moreDBLogo,
    code: DatabaseTypeCode.MONGODB,
    port: 27017,
    icon: '\uec21',
  },
};

export const databaseTypeList = Object.keys(databaseType).map((keys) => {
  return databaseType[keys];
});

export enum TreeNodeType {
  DATASOURCES = 'dataSources',
  DATASOURCE = 'dataSource',
  DATABASE = 'database',
  SCHEMAS = 'schemas',
  TABLES = 'tables',
  TABLE = 'table',
  COLUMNS = 'columns',
  COLUMN = 'column',
  KEYS = 'keys',
  KEY = 'key',
  INDEXES = 'indexes',
  INDEX = 'index',
  // SEARCH = 'search',
  // LINE = 'line',
  // LINETOTAL = 'lineTotal',
  // SAVE = 'save',
  // INDEXESTOTAL = 'indexesTotal',
}

export enum WindowTabStatus {
  DRAFT = 'DRAFT',
  RELEASE = 'RELEASE',
}

export enum ConsoleStatus {
  DRAFT = 'DRAFT',
  RELEASE = 'RELEASE',
}

export enum TableDataType {
  STRING = 'STRING',
  DATE = 'DATE',
  BYTE = 'BYTE',
  EMPTY = 'EMPTY',
  BIG_DECIMAL = 'BIG_DECIMAL',
}

export enum TableDataTypeCorresValue {
  STRING = 'stringValue',
  DATE = 'dateValue',
  BYTE = 'byteValue',
  EMPTY = 'emptyValue',
  BIG_DECIMAL = 'bigDecimalValue',
}

export enum EnvType {
  DAILY = 'DAILY',
  PRODUCT = 'PRODUCT',
}

export enum OSType {
  WIN = 'Win',
  MAC = 'Mac',
  RESTS = 'rests',
}
export enum ConsoleType {
  SQLQ = 'SQLQ',
  EDITTABLE = 'editTable',
}

export enum TabOpened {
  IS_OPEN = 'y',
  NOT_OPEN = 'n',
}

/** console顶部注释 */
export const consoleTopComment = `-- Chat2DB自然语言转SQL等AI功能 >> https://github.com/alibaba/Chat2DB/blob/main/CHAT2DB_AI_SQL.md\n\n`;
