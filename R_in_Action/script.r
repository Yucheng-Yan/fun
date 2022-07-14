a <- c(1, 2, 5, 3, 6, -1, 4)
b <- c("one", "two", "three")
c <- c(TRUE, TRUE, TRUE, FALSE, TRUE, FALSE)
a
b
c
a <- c("k", "j", "h", "a", "c", "m")
a[3]
a[c(1, 3, 5)]
a[2:6]

y <- matrix(1:20, nrow = 5, ncol = 4)
y

cells <- c(1, 26, 24, 68)
rnames <- c("R1", "R2")
cnames <- c("C1", "C2")
mymatrix <- matrix(cells, nrow = 2, ncol = 2, byrow = TRUE,
                   dimnames = list(rnames, cnames))
mymatrix

mymatrix <- matrix(cells, nrow = 2, ncol = 2, byrow = FALSE,
                   dimnames = list(rnames, cnames))

x <- matrix(1:10, nrow = 7)
x

x <- matrix(1:10, nrow = 2)
x
x[2,]
x[,2]
x[1,4]
x[1, c(4, 5)]

dim1 <- c("A1", "A2")
dim2 <- c("B1", "B2", "B3")
dim3 <- c("C1", "C2", "C3", "C4", "C5", "C6")
dim4 <- c("D1", "D2", "D3", "D4", "D5")
z <- array(1:50, c(2, 3, 6, 5), dimnames = list(dim1, dim2, dim3, dim4))
z

#Code List2-4
patientID <- c(1, 2, 3, 4)
age <- c(25, 34, 28, 52)
diabetes <- c("Type1", "Type2", "Type1", "Type1")
status <- c("Poor", "Improved", "Excellent", "Poor")
patientdata <- data.frame(patientID, age, diabetes, status)
patientdata
patientdata[1:2]
patientdata[c("diabetes", "status")]
patientdata$age

summary(mtcars$mpg)
plot(mtcars$mpg, mtcars$disp)
plot(mtcars$mpg, mtcars$wt)

attach(mtcars)
  summary(mpg)
  plot(mpg, disp)
  plot(mpg, wt)
  detach(mtcars)
  
vec <- 1:10
vec
summary(vec)

mpg <- c(25, 36, 47)
attach(mtcars)
plot(mpg, wt)
mpg

with(mtcars, {
  print(summary(mpg))
  plot(mpg, disp)
  plot(mpg, wt)
})

with(mtcars, {
  stats <- summary(mpg)
  real_stats <<- summary(mpg)
})
stats
real_stats
})

patientID <- c(1, 2, 3, 4)
age <- c(25, 34, 28, 52)
diabetes <- c("Type1", "Type2", "Type1", "Type1")
status <- c("Poor", "Improved", "Excellent", "Poor")
diabetes <- factor(diabetes)
status <- factor(status, order = TRUE)
patientdata <- data.frame(patientID, age, diabetes, status)
str(patientdata)
summary(patientdata)

#CodeList2-7
g <- "My First List"
h <- c(25, 26, 18, 39)
j <- matrix(1:10, nrow = 5)
k <- c("one", "two", "three")
mylist <- list(title = g, ages = h, j, k)
mylist
mylist[[2]]
mylist[["ages"]]

mydata <- data.frame(age = numeric(0),
                     gender = character(0), weight = numeric(0))
mydata <- edit(mydata)
mydata

mydatatxt <- "
age gender weight
25 m 166
30 f 115
18 f 120
"
mydata <- read.table(header = TRUE, text = mydatatxt)
mydata

pdf("mygraph.pdf")
attach(mtcars)
plot(wt, mpg)
abline(lm(mpg~wt))
title("Regression of MPG on Weight")
detach(mtcars)
dev.off()
help(plot)

dose <- c(20, 30, 40, 45, 60)
drugA <- c(16, 20, 27, 40, 60)
drugB <- c(15, 18, 25, 31, 40)
plot(dose, drugA, type="b")

opar <- par(no.readonly=TRUE)
par(lty=2, pch=17)
plot(dose, drugA, type="b")
par(opar)

plot(dose, drugA, type="b", lty=2, pch=17)

plot(dose, drugA, type="b")

plot(dose, drugA, lty=1, type="b", lwd=5, pch=11, cex=10)

n <- 7
mycolors <- brewer.pal(n, "Set1")
barplot(rep(1, n), col=mycolors)

n <- 10
mycolors <- rainbow(n)
pie(rep(1, n), labels=mycolors, col=mycolors)
mygrays <- gray(0:n/n)
pie(rep(1, n), labels=mygrays, col=mygrays)

par(font.lab=1, cex.lab=1, font.main=1, cex.main=1)

par(pin=c(4,3), mai=c(1, .5, 1, .2))

#CodeList3-1
dose <- c(20, 30, 40, 45, 60)
drugA <- c(16, 20, 27, 40, 60)
drugB <- c(15, 18, 25, 31, 40)

opar <- par(no.readonly=TRUE)
par(pin = c(2, 3))
par(lwd = 2, cex = 1.5)
par(cex.axis = .75, font.axis = 3)
plot(dose, drugA, type = "b", pch = 19, lty = 2, col = "red")
plot(dose, drugB, type = "b", pch = 23, lty = 6, col = "blue", bg = "green")
par(opar)
opar
opar$new = FALSE
opar$new

plot(dose, drugA, type="b",
     col="red", lty=2, pch=2, lwd=2,
     main="Clinical Trials for Drug A",
     sub="This is hypothetical data",
     xlab="Dosage", ylab="Drug Response",
     xlim=c(0, 60), ylim=c(0, 70) ,
     ann=FALSE)

title(main="My Title", col.main="red",
      sub="My Subtitle", col.sub="blue",
      xlab="My X label", ylab="My Y label",
      col.lab="green", cex.lab=0.75)

x <- c(1:10)
y <- x
z <- 10/x
opar <- par(no.readonly=TRUE)

par(mar=c(5, 4, 4, 8) + 0.1)
plot(x, y, type="b",
     pch=21, col="red",
     yaxt="n", lty=3, ann=FALSE)
lines(x, z, type="b", pch=22, col="blue", lty=2)

axis(2, at=x, labels=x, col.axis="red", las=2)

axis(4, at=z, labels=round(z, digits=2),
     col.axis="blue", las=2, cex.axis=0.7, tck=-.01)

mtext("y=1/x", side=4, line=3, cex.lab=1, las=2, col="blue")

title("An Example of Creative Axes",
      xlab="X values",
      ylab="Y=X")

par(opar)

dose <- c(20, 30, 40, 45, 60)
drugA <- c(16, 20, 27, 40, 60)
drugB <- c(15, 18, 25, 31, 40)

opar <- par(no.readonly=TRUE)

par(lwd=2, cex=1.5, font.lab=2)
plot(dose, drugA, type="b",
     pch=15, lty=1, col="red", ylim=c(0, 60),
     main="Drug A vs. Drug B",
     xlab="Drug Dosage", ylab="Drug Response")

lines(dose, drugB, type="b",
     pch=17, lty=2, col="blue")

abline(h=c(30), lwd=1.5, lty=2, col="gray")

library(Hmisc)
minor.tick(nx=3, ny=3, tick.ratio=0.5)

legend("topleft", inset=.05, title="Drug Type", c("A", "B"),
       lty=c(1, 2), pch=c(15, 17), col=c("red", "blue"))
par(opar)

attach(mtcars)
plot(wt, mpg,
     main="Mileage vs. Car Weight",
     xlab="Weight", ylab="Mileage",
     pch=18, col="blue")
text(wt, mpg,
     row.names(mtcars),
     cex=0.6, pos=4, col="red")
detach(mtcars)

opar <- par(no.readonly=TRUE)
par(cex=1.5)
plot(1:7, 1:7, type="n")
text(3, 3, "Example of default text")
text(4, 4, family="mono", "Example of mono-spaced text")
text(5, 5, family="serif", "Example of serif text")
par(opar)

opar <- par(no.readonly=TRUE)
par(mfrow=c(2, 2))
plot(wt, mpg, main="Scatterplot of wt vs. mpg")
plot(wt, disp, main="Scatterplot of wt vs. disp")
hist(wt, main="Histogram of wt")
boxplot(wt, main="Boxplot of wt")
par(opar)
detach(mtcars)

attach(mtcars)
opar <- par(no.readonly = TRUE)
par(mfrow = c(3, 1))
hist(wt, ann=FALSE)
hist(mpg)
hist(disp)
par(opar)
detach(mtcars)

attach(mtcars)
layout(matrix(c(1,1,2,3), 2, 2, byrow = TRUE))
hist(wt)
hist(mpg)
hist(disp)
detach(mtcars)

attach(mtcars)
layout(matrix(c(1, 1, 2, 3), 2, 2, byrow = TRUE),
       widths=c(3, 1), heights=c(1, 2))
hist(wt)
hist(mpg)
hist(disp)
detach(mtcars)

opar <- par(no.readonly=TRUE)
par(fig=c(0, 0.8, 0, 0.8))
plot(mtcars$wt, mtcars$mpg,
     xlab="Miles Per Gallon",
     ylab="Car Weight")
par(fig=c(0, 0.8, 0.55, 1), new=TRUE)
boxplot(mtcars$wt, horizontal=TRUE, axes=FALSE)

par(fig=c(0.65, 1, 0, 0.8), new=TRUE)
boxplot(mtcars$mpg, axes=FALSE)
mtext("Enhanced Scatterplot", side=3, outer=TRUE, line=-3)
par(opar)

manager <- c(1, 2, 3, 4, 5)
data <- c("10/24/08", "10/28/08", "10/1/08", "10/12/08", "5/1/09")
country <- c("US", "US", "UK", "UK", "UK")
gender <- c("M", "F", "F", "M", "F")
age <- c(32, 45, 25, 39, 99)
q1 <- c(5, 3, 3, 3, 2)
q2 <- c(4, 5, 5, 3, 2)
q3 <- c(5, 2, 5, 4, 1)
q4 <- c(5, 5, 5, NA, 2)
q5 <- c(5, 5, 2, NA, 1)
leadership <- data.frame(manager, data, country, gender, age,
                         q1, q2, q3, q4, q5, stringAsFactors=FALSE)

mydata <- data.frame(x1 = c(2, 2, 6, 4),
                     x2 = c(3, 4, 2, 8))
mydata$sumx <- mydata$x1 + mydata$x2
mydata$meanx <- (mydata$x1 + mydata$x2)/2

attach(mydata)
mydata$sumx <- x1 + x2
mydata$meanx <- (x1 + x2)/2
detach(mydata)

mydata <- transform(mydata,
                    sumx = x1 + x2,
                    meanx = (x1 + x2)/2)

leadership$age[leadership$age == 99] <- NA
leadership$agecat[leadership$age > 75] <- "Elder"
leadership$agecat[leadership$age >= 55 &
                    leadership$age <= 75] <- "Middle Aged"
leadership$agecat[leadership$age < 55] <- "Young"
leadership$agecat
fix(leadership)
leadership

names(leadership)
names(leadership)[6:10] <- c("item1", "item2", "item3", "item4", "item5")

install.packages("plyr")

library(plyr)
leadership <- rename(leadership, c(managerID="manager", testDate="TestDate"))
leadership

is.na(leadership[6:10])

leadership
newdata <- na.omit(leadership)
newdata

mydates <- as.Date(c("2007-06-22", "2004-02-13"))
mydates

strDates <- c("01/05/1965", "08/16/1975")
dates <- as.Date(strDates, "%m/%d/%Y")
dates

myformat <- "%m/%d/%y"
leadership$TestDate(leadership$TestDate, myformat)

Sys.Date()
date()
format(today, format="%A")

dob <- as.Date("1956-10-12")
format(dob, format="%A")

a <- c(1, 2, 3)
a
is.numeric(a)

is.vector(a)

a <- as.character(a)
a
is.numeric(a)
is.vector(a)
is.character(a)

newdata <- leadership[order(leadership$age),]

attach(leadership)
fix(leadership)
newdata <- leadership[order(gender, -age),]
detach(leadership)
newdata

myvars <- leadership[, c(6:10)]
myvars

newdata <- leadership[1:3, ]
newdata <- leadership[leadership$gender=="M" &
                        leadership$age > 30, ]
newdata

attach(leadership)
newdata <- leadership[gender=="M" & age > 30, ]
detach(leadership)
newdata

leadership


leadership$date <- as.Date(leadership$data, "%m/%d/%y")
startdate <- as.Date("2009-01-01")
enddate   <- as.Date("2009-10-31")

newdata   <- leadership[which(leadership$date >= startdate &
                                leadership$date <= enddate),]

newdata <- subset(leadership, age >= 35 | age < 24,
                  select=c(q1, q2, q3, q4))
newdata

newdata <- subset(leadership, age > 25 & gender == "M",
                  select=gender:q4)

mysample <- leadership[sample(1:nrow(leadership), 3, replace=FALSE),]

x <- c(1, 2, 3, 4, 5, 6, 7, 8)
mean(x)
sd(x)

n <- length(x)
meanx <- sum(x)/n
css <- sum((x - meanx)^2)
sdx <- sqrt(css / (n - 1))
meanx
sdx

x <- pretty(c(-3, 3), 30)
y <- dnorm(x)
plot(x, y,
     type = "l",
     xlab = "Normal Deviate",
     ylab = "Density",
     yaxs = "i")

runif(5)
set.seed(1234)
runif(5)

library(MASS)
options(digit=3)
set.seed(1234)

mean <- c(230.7, 146.7, 3.6)
sigma <- matrix(c(15360.8, 6721.2, -47.1,
                  6721.2, 4700.9, -16.5,
                  -47.1, -16.5, 0.3), nrow=3, ncol=3)
mydata <- mvrnorm(500, mean, sigma)
mydata <- as.data.frame(mydata)
names(mydata) <- c("y", "x1", "x2")

dim(mydata)
head(mydata, n=10)

x <- "abcdef"
substr(x, 2, 4) <- "2"
x

a <- 5
sqrt(a)
b <- c(1.243, 5.654, 2.99)
round(b)
c <- matrix(runif(12), nrow=3)
c
log(c)
mean(c)

mydata <- matrix(rnorm(30), nrow=6)
mydata
apply(mydata, 1, mean)
apply(mydata, 2, mean)
apply(mydata, 2, mean, trim=0.2)

options(digits=2)
Student <- c("John Davis", "Angela Williams", "Bullwinkle Moose",
             "David Jones", "Janice Markhammer", "Cheryl Cushing",
             "Reuven Ytzrhak", "Greg Knox", "Joel England",
             "Mary Rayburn")
Math <- c(502, 600, 412, 358, 495, 512, 410, 625, 573, 522)
Science <- c(95, 99, 80, 82, 75, 85, 80, 95, 89, 86)
English <- c(25, 22, 18, 15, 20, 28, 15, 30, 27, 18)
roster <- data.frame(Student, Math, Science, English,
                     stringsAsFactors=FALSE)
z <- scale(roster[,2:4])
score <- apply(z, 1, mean)
roster <- cbind(roster, score)

y <- quantile(score, c(.8, .6, .4, .2))
roster$grade[score >= y[1]] <- "A"
roster$grade[score < y[1] & score >= y[2]] <- "B"
roster$grade[score < y[2] & score >= y[3]] <- "C"
roster$grade[score < y[3] & score >= y[4]] <- "D"
roster$grade[score < y[4]] <- "F"
name <- strsplit((roster$Student), " ")
Lastname <- sapply(name, "[", 2)
Firstname <- sapply(name, "[", 1)
roster <- cbind(Firstname, Lastname, roster[, -1])
roster <- roster[order(Lastname, Firstname),]

feelings <- c("sad", "afraid")
for(i in feelings)
  print(
    switch(i,
           happy  = "I am glad you are happy",
           afraid = "There is nothing to fear",
           sad    = "Cheer up",
           angry  = "Calm down now"
           )
  )

mystats <- function(x, parametric=TRUE, print=FALSE) {
  if(parametric) {
    center <- mean(x);spread <- mad(x)
  } else {
    center <- median(x); spread <- mad(x)
  }
  if(print & parametric) {
    cat("Mean=", center, "\n", "SD=", spread, "\n")
  } else if(print & !parametric) {
    cat("Median=", center, "\n", "MAD=", spread, "\n")
  }
  result <- list(center=center, spread=spread)
  return(result)
}
set.seed(1234)
x <- rnorm(500)
y <- mystats(x, parametric=FALSE, print=TRUE)

mydate <- function(type="long") {
  switch(type,
         long  = format(Sys.time(), "%A %B %d %Y"),
         short = format(Sys.time(), "%m-%d-%y"),
         cat(type, "is not a recognized type \n")
         )
}
mydate("medium")

cars <- mtcars[1:5, 1:4]
cars
t(cars)

install.packages("vcd")
library(vcd)
md <- melt(mydata, id=c("ID", "Time"))
md

newdata <- dcast(md, formula, fun.aggregate)

Arthritis

counts <- table(Arthritis$Improved)
counts

barplot(counts,
        main="Simple Bar Plot",
        xlab="Improvement", ylab="Frequency")
barplot(counts,
        main="Horizontal Bar Plot",
        xlab="Frequency", ylab="Improvement",
        horiz=TRUE)

counts <- table(Arthritis$Improved, Arthritis$Treatment)
counts
barplot(counts,
        main="Stacked Bar Plot",
        xlab="Treatment", ylab="Frequency",
        col=c("red", "yellow", "green"),
        legend=rownames(counts))
barplot(counts,
        main="Grouped Bar Plot",
        xlab="Treatment", ylab="Frequency",
        col=c("red", "yellow", "green"),
        legend=rownames(counts), beside=TRUE)

states <- data.frame(state.region, state.x77)
means <- aggregate(states$Illiteracy, by=list(state.region), FUN=mean)
means
means <- means[order(means$x),]
means
bp <- barplot(means$x, names.arg=means$Group.1)
title("Mean Illiteracy Rate")
help(lines)

par(mar=c(5, 8, 4, 2))
par(las=2)
counts <- table(Arthritis$Improved)
barplot(counts,
            main="Treatment Outcome",
            horiz=TRUE,
            cex.names=0.8,
        names.arg=c("No Improvement", "Some Improvement",
                    "Marked Improvement"))

attach(Arthritis)
counts <- table(Treatment, Improved)
spine(counts, main="Spinogram Example")
detach(Arthritis)

par(mfrow=c(2, 2))
slices <- c(10, 12, 4, 16, 8)
lbls <- c("US", "UK", "Australia", "Germany", "France")
fan.plot(slices, labels = lbls, main="Fan Plot")

yttpie(slices, labels = lbls,
    main="Simple Pie Chart")

pct <- round(slices/sum(slices)*100)
lbls2 <- paste(lbls, " ", pct, "%", sep="")
pie(slices, labels=lbls2, col=rainbow(length(lbls2)),
    main="Pie Chart with Percentages")
library(plotrix)
pie3D(slices, labels=lbls, explode=0.1,
      main="3D Pie Chart")
mytable <- table(state.region)
lbls3 <- paste(names(mytable), "\n", mytable, sep="")
pie(mytable, labels = lbls3,
    main="Pie Chart from a Table\n (with sample sizes)")




par(mfrow=c(2, 2))

hist(mtcars$mpg)

hist(mtcars$mpg,
     breaks=12,
     col="red",
     xlab="Miles Per Gallon",
     main="Colored histogram with 12 bins")

hist(mtcars$mpg,
     freq=FALSE,
     breaks=12,
     col="red",
     xlab="Miles Per Gallon",
     main="Histogram, rug plot, density curve")
rug(jitter(mtcars$mpg))
lines(density(mtcars$mpg), col="blue", lwd=2)

x <- mtcars$mpg
h <- hist(x,
          breaks=12,
          col="red",
          xlab="Miles per Gallon",
          main="Histogram with normal curve and box")
xfit <- seq(min(x), max(x), length=40)
yfit <- dnorm(xfit, mean=mean(x), sd=sd(x))
yfit <- yfit*diff(h$mids[1:2])*length(x)
lines(xfit, yfit, col="blue", lwd=2)
box()

par(mfrow=c(2, 1))
d <- density(mtcars$mpg)

plot(d)

d <- density(mtcars$mpg)
plot(d, main="Kernel Density of Miles Per Gallon")
polygon(d, col="red", border="blue")
rug(mtcars$mpg, col="brown")
install.packages('sm')


library(sm)
attach(mtcars)

cyl.f <- factor(cyl, levels= c(4, 6, 8),
                labels = c("4 cylinder", "6 cylinder",
                           "8 cylinder"))

sm.density.compare(mpg, cyl, xlab="Miles Per Gallon")
title(main="MPG Distribution by Car Cylinders")

colfill <- c(2:(1+length(levels(cyl.f))))
legend(locator(1), levels(cyl.f), fill=colfill)

detach(mtcars)
boxplot.stats(mtcars$mpg)

boxplot(mpg~cyl, data=mtcars,
        notch=TRUE,
        varwidth=TRUE,
        col="red",
        main="Car Mileage Data",
        xlab="Number of Cylinders",
        ylab="Miles Per Gallon")

mtcars$cyl.f <- factor(mtcars$cyl,
                       levels=c(4, 6, 8),
                       labels=c("4", "6", "8"))

mtcars$am.f <- factor(mtcars$am,
                      levels=c(0, 1),
                      labels=c("auto", "standard"))

boxplot(mpg~am.f *cyl.f,
        data=mtcars,
        varwidth=TRUE,
        col=c("gold", "darkgreen"),
        main="MPG Distribution by Auto Type",
        xlab="Auto Type", ylab="Miles Per Gallon")

install.packages('vioplot')

library(vioplot)
x1 <- mtcars$mpg[mtcars$cyl==4]
x2 <- mtcars$mpg[mtcars$cyl==6]
x3 <- mtcars$mpg[mtcars$cyl==8]
vioplot(x1, x2, x3,
        names=c("4 cyl", "6 cyl", "8 cyl"),
        col="gold")

dotchart(mtcars$mpg, labels=row.names(mtcars), cex=.7,
         main="Gas Mileage for Car Models",
         xlab="Miles Per Gallon")

x <- mtcars[order(mtcars$mpg),]
x$cyl <- factor(x$cyl)

x$color[x$cyl==4] <- "red"
x$color[x$cyl==6] <- "blue"
x$color[x$cyl==8] <- "darkgreen"
dotchart(x$mpg,
         labels = row.names(x),
         cex=.7,
         groups = x$cyl,
         gcolor = "black",
         color = x$color,
         pch=19,
         main = "Gas Mileage for Car Models\ngrouped by cylinder",
         xlab = "Miles Per Gallon")

myvars <- c("mpg", "hp", "wt")
head(mtcars[myvars])
summary(mtcars[myvars])

mystats <- function(x, na.omit=FALSE){
            if (na.omit)
              x <- x[!is.na(x)]
            m <- mean(x)
            n <- length(x)
            s <- sd(x)
            skew <- sum((x-m)^3/s^3)/n
            kurt <- sum((x-m)^4/s^4)/n - 3
            return(c(n=n, mean=m, stdev=s, skew=skew, kurtosis=kurt))
}
myvars <- c("mpg", "hp", "wt")
sapply(mtcars[myvars], mystats)

install.packages('Hmisc')
library(Hmisc)
myvars <- c("mpg", "hp", "wt")
describe(mtcars[myvars])
install.packages('pastecs')
library(pastecs)
myvars <- c("mpg", "hp", "wt")
stat.desc(mtcars[myvars])

install.packages('psych')
library(psych)
describe(mtcars[myvars])
Hmisc::describe(mt)

aggregate(mtcars[myvars], by=list(am=mtcars$am), mean)
aggregate(mtcars[myvars], by=list(am=mtcars$am), sd)

dstats <- function(x)sapply(x, mystats)
by(mtcars[myvars], mtcars$am, dstats)
library(doBy)
summaryBy(mpg+hp+wt~am, data=mtcars, FUN=mystats)
library(psych)
describeBy(mtcars[myvars], list(am=mtcars$am))
