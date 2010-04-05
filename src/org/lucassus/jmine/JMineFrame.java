package org.lucassus.jmine;

import java.awt.GridBagConstraints;
import org.lucassus.jmine.dialogs.JDialogAbout;
import org.lucassus.jmine.dialogs.JDialogPreferences;
import org.lucassus.jmine.field.MineField;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.lucassus.jmine.field.Field;
import org.lucassus.jmine.field.GameIcon;
import org.lucassus.jmine.field.GameType;
import org.lucassus.jmine.field.observers.IMineFieldObserver;

public class JMineFrame extends javax.swing.JFrame implements IMineFieldObserver {

    private MineField mineField;
    private Locale currentLocale;
    private ResourceBundle messages;

    /** Creates new form JMineFrame */
    public JMineFrame() {
        currentLocale = new Locale("en", "GB");
        messages = ResourceBundle.getBundle("org/lucassus/jmine/resources/languages", currentLocale);
        initComponents();

        mineField = new MineField();
        mineField.attachMineFieldObserver(this);
        initCheckBoxes();

        newGame();
    }

    private void newGame() {
        mineField.initializeMineField();

        panelMineField.removeAll();
        for (Field field : mineField.getFields()) {
          GridBagConstraints gridBagConstraints = new GridBagConstraints();
          gridBagConstraints.gridx = field.getCoordinate().getX();
          gridBagConstraints.gridy = field.getCoordinate().getY();

          panelMineField.add(field, gridBagConstraints);
        }

        String numberOfNimes = Integer.toString(mineField.getGameType().getNumberOfMines());
        textFieldMinesLeftCount.setText(numberOfNimes);
        buttonNewGame.setIcon(GameIcon.FACE.getIcon());
        this.pack();
    }

    public JPanel getMineFieldPanel() {
        return panelMineField;
    }

    public MineField getMineField() {
        return mineField;
    }

    public JButton getNewGameButton() {
        return buttonNewGame;
    }

    private void initCheckBoxes() {
        if (mineField == null) {
            return;
        }

        if (mineField.getGameType() == GameType.NOVICE) {
            checkBoxMenuItemGameNovice.setSelected(true);
        } else if (mineField.getGameType() == GameType.INTERMEDIATE) {
            checkBoxMenuItemGameIntermediate.setSelected(true);
        } else if (mineField.getGameType() == GameType.EXPERT) {
            checkBoxMenuItemGameExpert.setSelected(true);
        } else {
            checkBoxMenuItemGameUser.setSelected(true);
        }
    }

    public JTextField getFlagsField() {
        return textFieldMinesLeftCount;
    }

    public JTextField getCounterField() {
        return textFieldCounter;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroupGameType = new javax.swing.ButtonGroup();
        buttonGroupLanguage = new javax.swing.ButtonGroup();
        jPanelTop = new javax.swing.JPanel();
        buttonNewGame = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        textFieldCounter = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        textFieldMinesLeftCount = new javax.swing.JTextField();
        panelMineField = new javax.swing.JPanel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuGame = new javax.swing.JMenu();
        jMenuItemNewGame = new javax.swing.JMenuItem();
        jMenuItemHint = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        checkBoxMenuItemGameNovice = new javax.swing.JCheckBoxMenuItem();
        checkBoxMenuItemGameIntermediate = new javax.swing.JCheckBoxMenuItem();
        checkBoxMenuItemGameExpert = new javax.swing.JCheckBoxMenuItem();
        checkBoxMenuItemGameUser = new javax.swing.JCheckBoxMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenuOptions = new javax.swing.JMenu();
        jMenuItemPreferences = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        checkBoxMenuItemAlwaysOnTop = new javax.swing.JCheckBoxMenuItem();
        jMenuHelp = new javax.swing.JMenu();
        jMenuItemAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JMine");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanelTop.setLayout(new java.awt.GridBagLayout());

        buttonNewGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/lucassus/jmine/resources/face.gif"))); // NOI18N
        buttonNewGame.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonNewGame.setPreferredSize(new java.awt.Dimension(28, 28));
        buttonNewGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonNewGameMousePressed(evt);
            }
        });
        buttonNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewGameActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanelTop.add(buttonNewGame, gridBagConstraints);

        textFieldCounter.setEditable(false);
        textFieldCounter.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textFieldCounter.setPreferredSize(new java.awt.Dimension(50, 19));
        jPanel1.add(textFieldCounter);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        jPanelTop.add(jPanel1, gridBagConstraints);

        textFieldMinesLeftCount.setEditable(false);
        textFieldMinesLeftCount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textFieldMinesLeftCount.setText("0");
        textFieldMinesLeftCount.setPreferredSize(new java.awt.Dimension(50, 19));
        jPanel2.add(textFieldMinesLeftCount);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        jPanelTop.add(jPanel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        getContentPane().add(jPanelTop, gridBagConstraints);

        panelMineField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelMineField.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 3, 0);
        getContentPane().add(panelMineField, gridBagConstraints);

        jMenuGame.setText(messages.getString("Game")); // NOI18N

        jMenuItemNewGame.setText(messages.getString("New_Game")); // NOI18N
        jMenuItemNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNewGameActionPerformed(evt);
            }
        });
        jMenuGame.add(jMenuItemNewGame);

        jMenuItemHint.setText(messages.getString("Hint")); // NOI18N
        jMenuItemHint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHintActionPerformed(evt);
            }
        });
        jMenuGame.add(jMenuItemHint);
        jMenuGame.add(jSeparator1);

        buttonGroupGameType.add(checkBoxMenuItemGameNovice);
        checkBoxMenuItemGameNovice.setText(messages.getString("Novice")); // NOI18N
        checkBoxMenuItemGameNovice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMenuItemGameNoviceActionPerformed(evt);
            }
        });
        jMenuGame.add(checkBoxMenuItemGameNovice);

        buttonGroupGameType.add(checkBoxMenuItemGameIntermediate);
        checkBoxMenuItemGameIntermediate.setText(messages.getString("Intermediate")); // NOI18N
        checkBoxMenuItemGameIntermediate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMenuItemGameIntermediateActionPerformed(evt);
            }
        });
        jMenuGame.add(checkBoxMenuItemGameIntermediate);

        buttonGroupGameType.add(checkBoxMenuItemGameExpert);
        checkBoxMenuItemGameExpert.setText(messages.getString("Expert")); // NOI18N
        checkBoxMenuItemGameExpert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMenuItemGameExpertActionPerformed(evt);
            }
        });
        jMenuGame.add(checkBoxMenuItemGameExpert);

        buttonGroupGameType.add(checkBoxMenuItemGameUser);
        checkBoxMenuItemGameUser.setText(messages.getString("User_game")); // NOI18N
        checkBoxMenuItemGameUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMenuItemGameUserActionPerformed(evt);
            }
        });
        jMenuGame.add(checkBoxMenuItemGameUser);
        jMenuGame.add(jSeparator3);

        jMenuItemExit.setText(messages.getString("Exit")); // NOI18N
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenuGame.add(jMenuItemExit);

        jMenuBar.add(jMenuGame);

        jMenuOptions.setText(messages.getString("Options")); // NOI18N

        jMenuItemPreferences.setText(messages.getString("Preferences")); // NOI18N
        jMenuItemPreferences.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPreferencesActionPerformed(evt);
            }
        });
        jMenuOptions.add(jMenuItemPreferences);
        jMenuOptions.add(jSeparator2);

        checkBoxMenuItemAlwaysOnTop.setText(messages.getString("Always_on_top")); // NOI18N
        checkBoxMenuItemAlwaysOnTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMenuItemAlwaysOnTopActionPerformed(evt);
            }
        });
        jMenuOptions.add(checkBoxMenuItemAlwaysOnTop);

        jMenuBar.add(jMenuOptions);

        jMenuHelp.setText(messages.getString("Help")); // NOI18N

        jMenuItemAbout.setText(messages.getString("About")); // NOI18N
        jMenuItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAboutActionPerformed(evt);
            }
        });
        jMenuHelp.add(jMenuItemAbout);

        jMenuBar.add(jMenuHelp);

        setJMenuBar(jMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void jMenuItemHintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHintActionPerformed
            mineField.hint();
	}//GEN-LAST:event_jMenuItemHintActionPerformed

	private void checkBoxMenuItemGameUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMenuItemGameUserActionPerformed
            mineField.setGameType(GameType.USER);
            newGame();
	}//GEN-LAST:event_checkBoxMenuItemGameUserActionPerformed

	private void checkBoxMenuItemGameExpertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMenuItemGameExpertActionPerformed
            mineField.setGameType(GameType.EXPERT);
            newGame();
	}//GEN-LAST:event_checkBoxMenuItemGameExpertActionPerformed

	private void checkBoxMenuItemGameIntermediateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMenuItemGameIntermediateActionPerformed
            mineField.setGameType(GameType.INTERMEDIATE);
            newGame();
	}//GEN-LAST:event_checkBoxMenuItemGameIntermediateActionPerformed

	private void checkBoxMenuItemGameNoviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMenuItemGameNoviceActionPerformed
            mineField.setGameType(GameType.NOVICE);
            newGame();
	}//GEN-LAST:event_checkBoxMenuItemGameNoviceActionPerformed

	private void buttonNewGameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNewGameMousePressed
            if (evt.getButton() == java.awt.event.MouseEvent.MOUSE_PRESSED) {
                buttonNewGame.setIcon(GameIcon.FACE.getIcon());
            }
	}//GEN-LAST:event_buttonNewGameMousePressed

	private void buttonNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewGameActionPerformed
            newGame();
	}//GEN-LAST:event_buttonNewGameActionPerformed

	private void jMenuItemNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNewGameActionPerformed
            newGame();
	}//GEN-LAST:event_jMenuItemNewGameActionPerformed

	private void jMenuItemPreferencesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPreferencesActionPerformed
            new JDialogPreferences(this, true).setVisible(true);
            initCheckBoxes();
            newGame();
	}//GEN-LAST:event_jMenuItemPreferencesActionPerformed

	private void checkBoxMenuItemAlwaysOnTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMenuItemAlwaysOnTopActionPerformed
            if (checkBoxMenuItemAlwaysOnTop.isSelected()) {
                this.setAlwaysOnTop(true);
            } else {
                this.setAlwaysOnTop(false);
            }
	}//GEN-LAST:event_checkBoxMenuItemAlwaysOnTopActionPerformed

	private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
            System.exit(0);
	}//GEN-LAST:event_jMenuItemExitActionPerformed

	private void jMenuItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAboutActionPerformed
            new JDialogAbout(this, true).setVisible(true);
	}//GEN-LAST:event_jMenuItemAboutActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupGameType;
    private javax.swing.ButtonGroup buttonGroupLanguage;
    private javax.swing.JButton buttonNewGame;
    private javax.swing.JCheckBoxMenuItem checkBoxMenuItemAlwaysOnTop;
    private javax.swing.JCheckBoxMenuItem checkBoxMenuItemGameExpert;
    private javax.swing.JCheckBoxMenuItem checkBoxMenuItemGameIntermediate;
    private javax.swing.JCheckBoxMenuItem checkBoxMenuItemGameNovice;
    private javax.swing.JCheckBoxMenuItem checkBoxMenuItemGameUser;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuGame;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JMenuItem jMenuItemAbout;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemHint;
    private javax.swing.JMenuItem jMenuItemNewGame;
    private javax.swing.JMenuItem jMenuItemPreferences;
    private javax.swing.JMenu jMenuOptions;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel panelMineField;
    private javax.swing.JTextField textFieldCounter;
    private javax.swing.JTextField textFieldMinesLeftCount;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateMinesLeftCount(int minesLeft) {
        textFieldMinesLeftCount.setText(Integer.toString(minesLeft));
    }

    @Override
    public void gameWin() {
        textFieldMinesLeftCount.setText("0");
        buttonNewGame.setIcon(GameIcon.FACE_WIN.getIcon());
    }

    @Override
    public void gameOver() {
        buttonNewGame.setIcon(GameIcon.FACE_DEAD.getIcon());
    }
}
