# Makefile for ShiftArray.java
# sdinay
# 08 - 20 - 2017
# ==================================================================

JAVASRC = ShiftArray.java
SOURCES = README Makefile $(JAVASRC)
MAINCLASS = ShiftArray
CLASSES = ShiftArray.class
JARFILE = ShiftArray

all: $(JARFILE)

$(JARFILE): $(CLASSES)
	echo Main-class: $(MAINCLASS) > Manifest
	jar cvfm $(JARFILE) Manifest $(CLASSES)
	rm Manifest
	chmod +x $(JARFILE)

$(CLASSES): $(JAVASRC)
	javac -Xlint $(JAVASRC)

run:
	java $(MAINCLASS)

clean:
	rm $(CLASSES) $(JARFILE)
