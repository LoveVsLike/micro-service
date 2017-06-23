#!/usr/bin/env bash
APP="ribbon"

export LANG="zh_CN.UTF-8"
export LC_ALL="zh_CN.UTF-8"
CURRENT_DATE=$(date +%Y%m%d-%H%M%S)

export JAVA_HOME=/opt/jdk
export JAVA_PATH=$JAVA_HOME/bin
export JAVA_OPTS="-Xms2048m -Xmx2048m -XX:MaxPermSize=256m"
CONFIG_PATH=$(cd "$(dirname "$0")/../conf";pwd)
LIB_PATH=$(cd "$(dirname "$0")/../libs";pwd)
LOG_BASE=$(cd "$(dirname "$0")/../logs";pwd)
LOG_DIR="$LOG_BASE/$APP"
export PID_FILE="$LOG_DIR/$APP.pid"

# 组装 CLASSPATH
ALL_JARS=$(ls "$LIB_PATH")
CLASS_PATH=""
for jar in $ALL_JARS
do
    CLASS_PATH="$CLASS_PATH""$LIB_PATH""/""$jar"":"
done
CLASS_PATH=`echo $CLASS_PATH | sed -r 's/^(.*):$/\1/g'`
