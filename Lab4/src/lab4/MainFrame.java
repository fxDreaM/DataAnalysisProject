package lab4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
        //Вызываем метод, отрисовывающий палитру
        paintPalette();
        //Отрисовываем 1 и 150 кадр с цветным и черно-белым режимом
        paintImage(1, "upper", "colorful");
        paintImage(1, "upper", "gray");
        paintImage(150, "bottom", "gray");
        paintImage(150, "bottom", "colorful");
    }
       //Определяем число,на которое будут сдвигать числа серой палитры
    private int shiftnumber = 6;
       //Определяем изначальное главное изображение
    private String choosed_image = "upper";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooseImageButtonGroup = new javax.swing.ButtonGroup();
        shiftNumberButtonGroup = new javax.swing.ButtonGroup();
        getFramesLabel = new javax.swing.JLabel();
        autoChooseButton = new javax.swing.JButton();
        manualChooseButton = new javax.swing.JButton();
        frameChooseSpinner = new javax.swing.JSpinner();
        frameLabel = new javax.swing.JLabel();
        palettePanel = new javax.swing.JPanel();
        temperatureLabel = new javax.swing.JLabel();
        temperatureTextField = new javax.swing.JTextField();
        coordinatesLabel = new javax.swing.JLabel();
        coordinateXLabel = new javax.swing.JLabel();
        coordinateXTextField = new javax.swing.JTextField();
        coordinateYLabel = new javax.swing.JLabel();
        coordinateYTextField = new javax.swing.JTextField();
        coordinatesTemperatureLabel = new javax.swing.JLabel();
        coordinateTemperatureTextField = new javax.swing.JTextField();
        upperFrameGrayImage = new javax.swing.JPanel();
        chooseImageLabel = new javax.swing.JLabel();
        upperImageRadioButton = new javax.swing.JRadioButton();
        bottomImageRadioButton = new javax.swing.JRadioButton();
        upperFrameTextField = new javax.swing.JTextField();
        upperFrameLabel = new javax.swing.JLabel();
        bottomFrameLabel = new javax.swing.JLabel();
        bottomFrameTextField = new javax.swing.JTextField();
        upperFrameColorImage = new javax.swing.JPanel();
        bottomFrameGrayImage = new javax.swing.JPanel();
        bottomFrameColorImage = new javax.swing.JPanel();
        matrixChoiceLabel = new javax.swing.JLabel();
        matrixButton1 = new javax.swing.JRadioButton();
        matrixButton2 = new javax.swing.JRadioButton();
        matrixButton3 = new javax.swing.JRadioButton();
        matrixButton4 = new javax.swing.JRadioButton();
        matrixButton5 = new javax.swing.JRadioButton();
        matrixButton6 = new javax.swing.JRadioButton();
        normalizeCheckBox = new javax.swing.JCheckBox();
        colornessCheckBox = new javax.swing.JCheckBox();
        upperImageMagnifierPanel = new javax.swing.JPanel();
        bottomImageMagnifierPanel = new javax.swing.JPanel();
        dynamicCheckBox = new javax.swing.JCheckBox();
        upperMagnifierImageCoordinateXLabel = new javax.swing.JLabel();
        upperMagnifierImageCoordinateXTextField = new javax.swing.JTextField();
        upperMagnifierImageCoordinateYLabel = new javax.swing.JLabel();
        upperMagnifierImageCoordinateYTextField = new javax.swing.JTextField();
        bottomMagnifierImageCoordinateXTextField = new javax.swing.JTextField();
        bottomMagnifierImageCoordinateXLabel = new javax.swing.JLabel();
        bottomMagnifierImageCoordinateYLabel = new javax.swing.JLabel();
        bottomMagnifierImageCoordinateYTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 800));

        getFramesLabel.setText("Загрузка кадров:");

        autoChooseButton.setText("Автоматически");
        autoChooseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoChooseButtonActionPerformed(evt);
            }
        });

        manualChooseButton.setText("Вручную");

        frameChooseSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 150, 1));
        frameChooseSpinner.setAutoscrolls(true);
        frameChooseSpinner.setRequestFocusEnabled(false);
        frameChooseSpinner.setValue(1);
        frameChooseSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                frameChooseSpinnerStateChanged(evt);
            }
        });

        frameLabel.setText("Кадр:");

        palettePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        palettePanel.setPreferredSize(new java.awt.Dimension(1289, 45));

        javax.swing.GroupLayout palettePanelLayout = new javax.swing.GroupLayout(palettePanel);
        palettePanel.setLayout(palettePanelLayout);
        palettePanelLayout.setHorizontalGroup(
            palettePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1274, Short.MAX_VALUE)
        );
        palettePanelLayout.setVerticalGroup(
            palettePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        temperatureLabel.setText("Температура");

        temperatureTextField.setEditable(false);
        temperatureTextField.setText("0");

        coordinatesLabel.setText("Координаты курсора: ");

        coordinateXLabel.setText("X =");

        coordinateXTextField.setEditable(false);
        coordinateXTextField.setText("0");

        coordinateYLabel.setText("Y  =");

        coordinateYTextField.setEditable(false);
        coordinateYTextField.setText("0");

        coordinatesTemperatureLabel.setText("Температура:");

        coordinateTemperatureTextField.setEditable(false);
        coordinateTemperatureTextField.setText("0");

        upperFrameGrayImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        upperFrameGrayImage.setPreferredSize(new java.awt.Dimension(384, 288));

        javax.swing.GroupLayout upperFrameGrayImageLayout = new javax.swing.GroupLayout(upperFrameGrayImage);
        upperFrameGrayImage.setLayout(upperFrameGrayImageLayout);
        upperFrameGrayImageLayout.setHorizontalGroup(
            upperFrameGrayImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        upperFrameGrayImageLayout.setVerticalGroup(
            upperFrameGrayImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );

        chooseImageLabel.setText("Изображение:");

        chooseImageButtonGroup.add(upperImageRadioButton);
        upperImageRadioButton.setSelected(true);
        upperImageRadioButton.setText("Верхнее");
        upperImageRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upperImageRadioButtonActionPerformed(evt);
            }
        });

        chooseImageButtonGroup.add(bottomImageRadioButton);
        bottomImageRadioButton.setText("Нижнее");
        bottomImageRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottomImageRadioButtonActionPerformed(evt);
            }
        });

        upperFrameTextField.setEditable(false);
        upperFrameTextField.setText("1");

        upperFrameLabel.setText("Кадр:");

        bottomFrameLabel.setText("Кадр:");

        bottomFrameTextField.setEditable(false);
        bottomFrameTextField.setText("150");

        upperFrameColorImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        upperFrameColorImage.setPreferredSize(new java.awt.Dimension(384, 288));

        javax.swing.GroupLayout upperFrameColorImageLayout = new javax.swing.GroupLayout(upperFrameColorImage);
        upperFrameColorImage.setLayout(upperFrameColorImageLayout);
        upperFrameColorImageLayout.setHorizontalGroup(
            upperFrameColorImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        upperFrameColorImageLayout.setVerticalGroup(
            upperFrameColorImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );

        bottomFrameGrayImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bottomFrameGrayImage.setPreferredSize(new java.awt.Dimension(384, 288));

        javax.swing.GroupLayout bottomFrameGrayImageLayout = new javax.swing.GroupLayout(bottomFrameGrayImage);
        bottomFrameGrayImage.setLayout(bottomFrameGrayImageLayout);
        bottomFrameGrayImageLayout.setHorizontalGroup(
            bottomFrameGrayImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        bottomFrameGrayImageLayout.setVerticalGroup(
            bottomFrameGrayImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );

        bottomFrameColorImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bottomFrameColorImage.setPreferredSize(new java.awt.Dimension(384, 288));

        javax.swing.GroupLayout bottomFrameColorImageLayout = new javax.swing.GroupLayout(bottomFrameColorImage);
        bottomFrameColorImage.setLayout(bottomFrameColorImageLayout);
        bottomFrameColorImageLayout.setHorizontalGroup(
            bottomFrameColorImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        bottomFrameColorImageLayout.setVerticalGroup(
            bottomFrameColorImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );

        matrixChoiceLabel.setText("Сдвигать коды серой палитры на:");

        shiftNumberButtonGroup.add(matrixButton1);
        matrixButton1.setText("1");
        matrixButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matrixButton1ActionPerformed(evt);
            }
        });

        shiftNumberButtonGroup.add(matrixButton2);
        matrixButton2.setText("2");
        matrixButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matrixButton2ActionPerformed(evt);
            }
        });

        shiftNumberButtonGroup.add(matrixButton3);
        matrixButton3.setText("3");
        matrixButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matrixButton3ActionPerformed(evt);
            }
        });

        shiftNumberButtonGroup.add(matrixButton4);
        matrixButton4.setText("4");
        matrixButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matrixButton4ActionPerformed(evt);
            }
        });

        shiftNumberButtonGroup.add(matrixButton5);
        matrixButton5.setText("5");
        matrixButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matrixButton5ActionPerformed(evt);
            }
        });

        shiftNumberButtonGroup.add(matrixButton6);
        matrixButton6.setSelected(true);
        matrixButton6.setText("6");
        matrixButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matrixButton6ActionPerformed(evt);
            }
        });

        normalizeCheckBox.setSelected(true);
        normalizeCheckBox.setText("Нормировать яркость");

        colornessCheckBox.setText("Отображать в цвете");

        upperImageMagnifierPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        upperImageMagnifierPanel.setPreferredSize(new java.awt.Dimension(180, 180));

        javax.swing.GroupLayout upperImageMagnifierPanelLayout = new javax.swing.GroupLayout(upperImageMagnifierPanel);
        upperImageMagnifierPanel.setLayout(upperImageMagnifierPanelLayout);
        upperImageMagnifierPanelLayout.setHorizontalGroup(
            upperImageMagnifierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        upperImageMagnifierPanelLayout.setVerticalGroup(
            upperImageMagnifierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );

        bottomImageMagnifierPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bottomImageMagnifierPanel.setPreferredSize(new java.awt.Dimension(180, 180));

        javax.swing.GroupLayout bottomImageMagnifierPanelLayout = new javax.swing.GroupLayout(bottomImageMagnifierPanel);
        bottomImageMagnifierPanel.setLayout(bottomImageMagnifierPanelLayout);
        bottomImageMagnifierPanelLayout.setHorizontalGroup(
            bottomImageMagnifierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        bottomImageMagnifierPanelLayout.setVerticalGroup(
            bottomImageMagnifierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );

        dynamicCheckBox.setText("Отображать в динамике");

        upperMagnifierImageCoordinateXLabel.setText("X=");

        upperMagnifierImageCoordinateXTextField.setEditable(false);
        upperMagnifierImageCoordinateXTextField.setText("0");

        upperMagnifierImageCoordinateYLabel.setText("Y=");

        upperMagnifierImageCoordinateYTextField.setEditable(false);
        upperMagnifierImageCoordinateYTextField.setText("0");

        bottomMagnifierImageCoordinateXTextField.setEditable(false);
        bottomMagnifierImageCoordinateXTextField.setText("0");

        bottomMagnifierImageCoordinateXLabel.setText("X=");

        bottomMagnifierImageCoordinateYLabel.setText("Y=");

        bottomMagnifierImageCoordinateYTextField.setEditable(false);
        bottomMagnifierImageCoordinateYTextField.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(palettePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bottomFrameLabel)
                                    .addComponent(temperatureLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(temperatureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(manualChooseButton)
                                    .addComponent(getFramesLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(frameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(frameChooseSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(autoChooseButton))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bottomImageRadioButton)
                                        .addGap(893, 893, 893))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chooseImageLabel)
                                            .addComponent(upperImageRadioButton))
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(matrixButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(matrixButton2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(matrixButton3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(matrixButton4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(matrixButton5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(matrixButton6))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(matrixChoiceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                                .addGap(888, 888, 888))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(coordinatesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(coordinateXLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(coordinateXTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(coordinateYLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(coordinateYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(upperFrameLabel)
                                            .addComponent(coordinatesTemperatureLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(coordinateTemperatureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(upperFrameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bottomFrameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(upperFrameGrayImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bottomFrameGrayImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(upperFrameColorImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bottomFrameColorImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bottomImageMagnifierPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(normalizeCheckBox)
                                    .addComponent(colornessCheckBox)
                                    .addComponent(upperImageMagnifierPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dynamicCheckBox)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(upperMagnifierImageCoordinateXLabel)
                                        .addGap(2, 2, 2)
                                        .addComponent(upperMagnifierImageCoordinateXTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(upperMagnifierImageCoordinateYLabel)
                                        .addGap(3, 3, 3)
                                        .addComponent(upperMagnifierImageCoordinateYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bottomMagnifierImageCoordinateXLabel)
                                        .addGap(1, 1, 1)
                                        .addComponent(bottomMagnifierImageCoordinateXTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(bottomMagnifierImageCoordinateYLabel)
                                        .addGap(1, 1, 1)
                                        .addComponent(bottomMagnifierImageCoordinateYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getFramesLabel)
                    .addComponent(autoChooseButton)
                    .addComponent(chooseImageLabel)
                    .addComponent(matrixChoiceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manualChooseButton)
                    .addComponent(frameLabel)
                    .addComponent(frameChooseSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upperImageRadioButton)
                    .addComponent(matrixButton1)
                    .addComponent(matrixButton2)
                    .addComponent(matrixButton3)
                    .addComponent(matrixButton4)
                    .addComponent(matrixButton5)
                    .addComponent(matrixButton6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(bottomImageRadioButton)
                        .addGap(20, 20, 20)
                        .addComponent(normalizeCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(colornessCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dynamicCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(upperImageMagnifierPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(coordinatesLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(coordinateXLabel)
                                    .addComponent(coordinateXTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(coordinateYLabel)
                                    .addComponent(coordinateYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(coordinatesTemperatureLabel)
                                    .addComponent(coordinateTemperatureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(upperFrameLabel)
                                    .addComponent(upperFrameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(upperFrameGrayImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upperFrameColorImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upperMagnifierImageCoordinateXLabel)
                    .addComponent(upperMagnifierImageCoordinateXTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upperMagnifierImageCoordinateYLabel)
                    .addComponent(upperMagnifierImageCoordinateYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bottomFrameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bottomFrameLabel))
                                .addGap(180, 180, 180)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(temperatureLabel)
                                    .addComponent(temperatureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bottomFrameColorImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bottomFrameGrayImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)))
                        .addComponent(palettePanel, 38, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bottomImageMagnifierPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bottomMagnifierImageCoordinateXTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bottomMagnifierImageCoordinateXLabel)
                            .addComponent(bottomMagnifierImageCoordinateYLabel)
                            .addComponent(bottomMagnifierImageCoordinateYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Методы, вызывающиеся при изменении числа сдвига пикселей
    private void matrixButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrixButton1ActionPerformed
        shiftnumber = 1;
    }//GEN-LAST:event_matrixButton1ActionPerformed

    private void matrixButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrixButton2ActionPerformed
        shiftnumber = 2;
    }//GEN-LAST:event_matrixButton2ActionPerformed

    private void matrixButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrixButton3ActionPerformed
        shiftnumber = 3;
    }//GEN-LAST:event_matrixButton3ActionPerformed

    private void matrixButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrixButton4ActionPerformed
        shiftnumber = 4;
    }//GEN-LAST:event_matrixButton4ActionPerformed

    private void matrixButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrixButton5ActionPerformed
        shiftnumber = 5;
    }//GEN-LAST:event_matrixButton5ActionPerformed

    private void matrixButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrixButton6ActionPerformed
        shiftnumber = 6;
    }//GEN-LAST:event_matrixButton6ActionPerformed

    //Метод, вызывающийся при запуске автоматической загрузки кадров
    private void autoChooseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoChooseButtonActionPerformed
       //Создаем новый поток, чтобы изображение менялось одновременно со сменой кадра
        new Thread() {

            @Override
            public void run() {

                try {
                    //с задержкой в 50 миллисекунд выводим последовательно кадры изображения(в цветном и черно-белом виде)
                    for (int i = 1; i < 151; i++, Thread.sleep(50)) {
                        frameChooseSpinner.setValue(i);
                        paintImage((int) frameChooseSpinner.getValue(), choosed_image, "gray");
                        paintImage((int) frameChooseSpinner.getValue(), choosed_image, "colorful");

                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }.start();

    }//GEN-LAST:event_autoChooseButtonActionPerformed
 //Метод,вызывающийся при смене номера кадра
    private void frameChooseSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_frameChooseSpinnerStateChanged
        try {
            //Вызываем методы отрисовки выбранного кадра в черно-белом и цветном режиме
            paintImage((int) frameChooseSpinner.getValue(), choosed_image, "gray");
            paintImage((int) frameChooseSpinner.getValue(), choosed_image, "colorful");
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_frameChooseSpinnerStateChanged
 //Методы,вызывающиеся при смене главного изображения
    private void upperImageRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upperImageRadioButtonActionPerformed
        choosed_image = "upper";
    }//GEN-LAST:event_upperImageRadioButtonActionPerformed

    private void bottomImageRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottomImageRadioButtonActionPerformed
        choosed_image = "bottom";
    }//GEN-LAST:event_bottomImageRadioButtonActionPerformed
//Метод, в котором мы заполняем палитру
    private void paintPalette() {
        palettePanel.setLayout(new BorderLayout());
        //Создаем обьект класса,в котором будет происходить рисование палитры и определяем метод,показывающий код температуры при наведении на цвет
        PaintPaletteForm ppf = new PaintPaletteForm();
        palettePanel.add(ppf, BorderLayout.CENTER);
        ppf.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                temperatureTextField.setText(Integer.toString(evt.getX() * 13 - 6));
            }
        });
    }
  //Метод,отвечающий за отрисовку изображений во всех 4 главных формах(место рисования меняется в зависимости от параметров метода)
    private void paintImage(int frame_number, String image_number, String colorness) throws IOException {
        //Определяем,в какой панели мы хотим отрисовать изображение
        JPanel panel = new JPanel();
        if (image_number.equals("upper")) {
            upperFrameTextField.setText(Integer.toString(frame_number));
            if (colorness.equals("colorful")) {
                panel = upperFrameColorImage;
            } else {
                panel = upperFrameGrayImage;
            }

        } else if (image_number.equals("bottom")) {
            bottomFrameTextField.setText(Integer.toString(frame_number));
            if (colorness.equals("gray")) {
                panel = bottomFrameGrayImage;
            } else {
                panel = bottomFrameColorImage;
            }
        }
        // Перед новой отрисовкой очищаем панель от всех уже нарисованных раннее элементов
        panel.removeAll();
        String temp_str = Integer.toString(frame_number);
        if (frame_number < 10) {
            temp_str = "0" + temp_str;
        }
        //Считываем байты из файла
        byte[] array = Files.readAllBytes(Paths.get("150 файлов формата mbv от ИК камеры\\0001_0001_00332_1_00329_01_30_1_" + temp_str + ".mbv"));
        ArrayList<Short> numbers = new ArrayList<Short>();
        for (int i = 0; i < array.length - 1; i += 2) {
            //Переводим little endian в big endian
            byte temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
            //Наполняем полученными числами типа short наш массив со значениями яркости пикселей
            numbers.add(ByteBuffer.wrap(Arrays.copyOfRange(array, i, i + 2)).getShort());
        }
        //Создаем двумерный массив,который будет хранить пиксели нашего изображения
        int imagewidth = 384;
        int imageheight = 288;
        short codes_array[][] = new short[imageheight][imagewidth];
        int temp = 2;
        for (int y = 0; y < imageheight; y++) {
            for (int x = 0; x < imagewidth; x++) {
                codes_array[y][x] = numbers.get(temp++);
            }
        }
        //В зависимости от того,цветное изображение нужно или черно-белое,выполняем соответсвующие алгоритмы
        BufferedImage img = new BufferedImage(imagewidth, imageheight, BufferedImage.TYPE_INT_RGB);
        if (colorness.equals("gray")) {
            for (int y = 0; y < imageheight; y++) {
                for (int x = 0; x < imagewidth; x++) {
                    short number = (short) (codes_array[y][x]);
                    number = (short) (number >> shiftnumber);
                    int rgb = number;
                    rgb = (rgb << 8) + number;
                    rgb = (rgb << 8) + number;
                    img.setRGB(x, y, rgb);
                }
            }
        } else if (colorness.equals("colorful")) {

            for (int y = 0; y < imageheight; y++) {
                for (int x = 0; x < imagewidth; x++) {
                    //Определяем нужный цвет пикселя, вызывая метод из другого класса с нужным нам массивом цветов, созданном на основе палитры
                    Color cl = PaintPaletteForm.getColor(codes_array[y][x] / 13);
                    img.setRGB(x, y, cl.getRGB());

                }
            }
        }
        panel.setLayout(new BorderLayout());
        final JLabel imageLabel = new JLabel(new ImageIcon(img));
        //Связываем положение нашего курсора на изображении со текстовыми полями координат
        imageLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                coordinateYTextField.setText(Integer.toString(evt.getY()));
                coordinateXTextField.setText(Integer.toString(evt.getX()));
                coordinateTemperatureTextField.setText(Integer.toString(codes_array[evt.getY()][evt.getX()]));
            }
        });

        if (panel == upperFrameGrayImage) {
            imageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    paintEnlargedImage(evt.getX(), evt.getY(), 2, upperImageMagnifierPanel, codes_array);
                    upperMagnifierImageCoordinateXTextField.setText(Integer.toString(evt.getX()));
                    upperMagnifierImageCoordinateYTextField.setText(Integer.toString(evt.getY()));
                }
            });
            //Вызываем перерисовку изображения лупы каждый раз при смене кадра,если нам нужно отображать изображение с лупы в динамике
            if (dynamicCheckBox.isSelected()) {
                paintEnlargedImage(X, Y, 2, upperImageMagnifierPanel, codes_array);
            }
        } else if (panel == bottomFrameGrayImage) {
            imageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    paintEnlargedImage(evt.getX(), evt.getY(), 2, bottomImageMagnifierPanel, codes_array);
                    bottomMagnifierImageCoordinateXTextField.setText(Integer.toString(evt.getX()));
                    bottomMagnifierImageCoordinateYTextField.setText(Integer.toString(evt.getY()));
                }
                
            });
            //Вызываем перерисовку изображения лупы каждый раз при смене кадра,если нам нужно отображать изображение с лупы в динамике
            if (dynamicCheckBox.isSelected()) {
                paintEnlargedImage(X, Y, 2, bottomImageMagnifierPanel, codes_array);
            }
        }
        panel.add(imageLabel, BorderLayout.CENTER);
        panel.revalidate();

    }

    //Обьявляем вне тел методов,чтобы мы могли перерисовывать изображения после смены параметров
    int X, Y;
    //Метод.отвечающий за отрисовку увеличенного изображения
    private void paintEnlargedImage(int x_c, int y_c, int multiplier, JPanel panel, short[][] codes_array) {
        //Очищаем прошлые данные с панели отрисовки увеличенного изображения
        panel.removeAll();
        X = x_c;
        Y = y_c;
        
        //Определяем длину и высоту массива пикселей(+1 требуется для интерполяции,где используются цвета пикселей,не имеющих изображения на форме)
        int pixels_width = (180 / multiplier) + 1;
        int pixels_height = (180 / multiplier) + 1;
        short pixels[][] = new short[pixels_height][pixels_width];
        //Заполняем наш массив пикселей пикселями  с нужными координатами из исходного изображения и вычисляем минимальную и максимальную яркость(для нормирования)
        int pix_max = codes_array[y_c][x_c];
        int pix_min = codes_array[y_c][x_c];
        for (int y = 0; y < pixels_height; y++) {
            for (int x = 0; x < pixels_width; x++) {
                try {
                    pixels[y][x] = codes_array[Y - pixels_height / 2 + y][X - pixels_width / 2 + x];
                    if (pixels[y][x] < pix_min) {
                        pix_min = pixels[y][x];
                    } else if (pixels[y][x] > pix_max) {
                        pix_max = pixels[y][x];
                    }
                } catch (IndexOutOfBoundsException e) {
                    return;
                }
            }
        }
        //нормализуем изображение,если нужно
        int local_shiftnumber=shiftnumber;
        if (normalizeCheckBox.isSelected()) {
            local_shiftnumber = 0;
            //Определяем коэффициент,на который будем умножать цвета пикселей(в зависимости от минимального и максимального цвета пикселя на выбранном участке)
            double d = ((double) 255 / (pix_max - pix_min));
            for (int y = 0; y < pixels_height - 1; y++) {
                for (int x = 0; x < pixels_width - 1; x++) {
                    pixels[y][x] = (short) ((pixels[y][x] - pix_min) * d);
                }
            }
        }
        //Создаем временный контейнер для нашего изображения
        BufferedImage img = new BufferedImage(180, 180, BufferedImage.TYPE_INT_RGB);
        //Инициализируем временные переменные для правильного прохода по нашему массиву с цветами пикселей
        int f, g;
        int first = 0, second = multiplier - 1;
        int first_1 = 0, second_1 = multiplier - 1;
        short pixel;
        int d, a, b, c;
        //Проходим сначала по столбам
        for (int y = 0; y < pixels.length - 1; y++) {
            //Потом по строкам в столбце
            for (int x = 0; x < pixels[x].length - 1; x++) {
                //Инициализируем наши коэффициенты для дальнейшего вычисления итогового цвета пикселя
                d = pixels[y][x];
                a = pixels[y + 1][x] - d;
                b = pixels[y][x + 1] - d;
                c = pixels[y + 1][x + 1] - a - b - d;
                //Вычисляем цвет итогового пикселя по формуле I(xл, yл)  = a xл + b yл + c xл yл – d, за xл и yл принимаем константу 0.3(поскольку функция линейна)
                pixel = (short) (a * 0.3 + b * 0.3 + c * 0.3 * 0.3 - d);
                if (pixel < 0) {
                    pixel = (short) (0 - pixel);
                }
                for (f = first; f < second + 1; f++) {
                    for (g = first_1; g < second_1 + 1; g++) {
                        //Окрашиваем цветами из палитры,если выбрал соответсвующий параметр
                        if (colornessCheckBox.isSelected()) {
                            Color cl = PaintPaletteForm.getColor(pixel / 13);
                            img.setRGB(g, f, cl.getRGB());
                        } else {
                            pixel = (short) (pixel >> local_shiftnumber);
                            int rgb = pixel;
                            rgb = (rgb << 8) + pixel;
                            rgb = (rgb << 8) + pixel;
                            img.setRGB(g, f, rgb);
                        }
                    }
                }
                first_1 = second_1 + 1;
                second_1 += multiplier;
            }
            first_1 = 0;
            second_1 = multiplier - 1;
            first = second + 1;
            second += multiplier;
        }
        panel.setLayout(new BorderLayout());
        final JLabel enLabel = new JLabel(new ImageIcon(img));
        panel.add(enLabel, BorderLayout.CENTER);
        panel.revalidate();
    }
//Метод main, вызывающийся при запуске программы
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton autoChooseButton;
    private javax.swing.JPanel bottomFrameColorImage;
    private javax.swing.JPanel bottomFrameGrayImage;
    private javax.swing.JLabel bottomFrameLabel;
    private javax.swing.JTextField bottomFrameTextField;
    private javax.swing.JPanel bottomImageMagnifierPanel;
    private javax.swing.JRadioButton bottomImageRadioButton;
    private javax.swing.JLabel bottomMagnifierImageCoordinateXLabel;
    private javax.swing.JTextField bottomMagnifierImageCoordinateXTextField;
    private javax.swing.JLabel bottomMagnifierImageCoordinateYLabel;
    private javax.swing.JTextField bottomMagnifierImageCoordinateYTextField;
    private javax.swing.ButtonGroup chooseImageButtonGroup;
    private javax.swing.JLabel chooseImageLabel;
    private javax.swing.JCheckBox colornessCheckBox;
    private javax.swing.JTextField coordinateTemperatureTextField;
    private javax.swing.JLabel coordinateXLabel;
    private javax.swing.JTextField coordinateXTextField;
    private javax.swing.JLabel coordinateYLabel;
    private javax.swing.JTextField coordinateYTextField;
    private javax.swing.JLabel coordinatesLabel;
    private javax.swing.JLabel coordinatesTemperatureLabel;
    private javax.swing.JCheckBox dynamicCheckBox;
    private javax.swing.JSpinner frameChooseSpinner;
    private javax.swing.JLabel frameLabel;
    private javax.swing.JLabel getFramesLabel;
    private javax.swing.JButton manualChooseButton;
    private javax.swing.JRadioButton matrixButton1;
    private javax.swing.JRadioButton matrixButton2;
    private javax.swing.JRadioButton matrixButton3;
    private javax.swing.JRadioButton matrixButton4;
    private javax.swing.JRadioButton matrixButton5;
    private javax.swing.JRadioButton matrixButton6;
    private javax.swing.JLabel matrixChoiceLabel;
    private javax.swing.JCheckBox normalizeCheckBox;
    private javax.swing.JPanel palettePanel;
    private javax.swing.ButtonGroup shiftNumberButtonGroup;
    private javax.swing.JLabel temperatureLabel;
    private javax.swing.JTextField temperatureTextField;
    private javax.swing.JPanel upperFrameColorImage;
    private javax.swing.JPanel upperFrameGrayImage;
    private javax.swing.JLabel upperFrameLabel;
    private javax.swing.JTextField upperFrameTextField;
    private javax.swing.JPanel upperImageMagnifierPanel;
    private javax.swing.JRadioButton upperImageRadioButton;
    private javax.swing.JLabel upperMagnifierImageCoordinateXLabel;
    private javax.swing.JTextField upperMagnifierImageCoordinateXTextField;
    private javax.swing.JLabel upperMagnifierImageCoordinateYLabel;
    private javax.swing.JTextField upperMagnifierImageCoordinateYTextField;
    // End of variables declaration//GEN-END:variables
}
