﻿namespace CSharp_droidRat_GUI_Server.Form.MainForm
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }

            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.ConnectButton = new System.Windows.Forms.Button();
            this.urlBox = new System.Windows.Forms.TextBox();
            this.ServerUrlLabel = new System.Windows.Forms.Label();
            this.CloseButton = new System.Windows.Forms.Button();
            this.MainFormMenu = new System.Windows.Forms.MenuStrip();
            this.passToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.settingToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.feautreToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.MainFormMenu.SuspendLayout();
            this.SuspendLayout();
            // 
            // ConnectButton
            // 
            this.ConnectButton.Font = new System.Drawing.Font("標楷體", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte) (136)));
            this.ConnectButton.Location = new System.Drawing.Point(12, 402);
            this.ConnectButton.Name = "ConnectButton";
            this.ConnectButton.Size = new System.Drawing.Size(141, 36);
            this.ConnectButton.TabIndex = 0;
            this.ConnectButton.Text = "Connect";
            this.ConnectButton.UseVisualStyleBackColor = true;
            this.ConnectButton.Click += new System.EventHandler(this.ConnectButton_Click);
            // 
            // urlBox
            // 
            this.urlBox.Font = new System.Drawing.Font("標楷體", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte) (136)));
            this.urlBox.Location = new System.Drawing.Point(168, 34);
            this.urlBox.Name = "urlBox";
            this.urlBox.Size = new System.Drawing.Size(330, 36);
            this.urlBox.TabIndex = 1;
            this.urlBox.Text = "ws://192.168.1.100:5050";
            // 
            // ServerUrlLabel
            // 
            this.ServerUrlLabel.Font = new System.Drawing.Font("標楷體", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte) (136)));
            this.ServerUrlLabel.Location = new System.Drawing.Point(12, 34);
            this.ServerUrlLabel.Name = "ServerUrlLabel";
            this.ServerUrlLabel.Size = new System.Drawing.Size(150, 36);
            this.ServerUrlLabel.TabIndex = 2;
            this.ServerUrlLabel.Text = "Server Url:";
            // 
            // CloseButton
            // 
            this.CloseButton.Font = new System.Drawing.Font("標楷體", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte) (136)));
            this.CloseButton.Location = new System.Drawing.Point(159, 402);
            this.CloseButton.Name = "CloseButton";
            this.CloseButton.Size = new System.Drawing.Size(141, 36);
            this.CloseButton.TabIndex = 3;
            this.CloseButton.Text = "Close";
            this.CloseButton.UseVisualStyleBackColor = true;
            this.CloseButton.Click += new System.EventHandler(this.CloseButton_Click);
            // 
            // MainFormMenu
            // 
            this.MainFormMenu.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {this.passToolStripMenuItem, this.settingToolStripMenuItem, this.feautreToolStripMenuItem});
            this.MainFormMenu.Location = new System.Drawing.Point(0, 0);
            this.MainFormMenu.Name = "MainFormMenu";
            this.MainFormMenu.Size = new System.Drawing.Size(800, 24);
            this.MainFormMenu.TabIndex = 4;
            this.MainFormMenu.Text = "MainGUIMenu";
            // 
            // passToolStripMenuItem
            // 
            this.passToolStripMenuItem.Name = "passToolStripMenuItem";
            this.passToolStripMenuItem.Size = new System.Drawing.Size(38, 20);
            this.passToolStripMenuItem.Text = "File";
            // 
            // settingToolStripMenuItem
            // 
            this.settingToolStripMenuItem.Name = "settingToolStripMenuItem";
            this.settingToolStripMenuItem.Size = new System.Drawing.Size(59, 20);
            this.settingToolStripMenuItem.Text = "Setting";
            // 
            // feautreToolStripMenuItem
            // 
            this.feautreToolStripMenuItem.Name = "feautreToolStripMenuItem";
            this.feautreToolStripMenuItem.Size = new System.Drawing.Size(61, 20);
            this.feautreToolStripMenuItem.Text = "Feature";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.CloseButton);
            this.Controls.Add(this.ServerUrlLabel);
            this.Controls.Add(this.urlBox);
            this.Controls.Add(this.ConnectButton);
            this.Controls.Add(this.MainFormMenu);
            this.Font = new System.Drawing.Font("新細明體", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte) (136)));
            this.MainMenuStrip = this.MainFormMenu;
            this.Name = "Form1";
            this.Text = "MainForm";
            this.MainFormMenu.ResumeLayout(false);
            this.MainFormMenu.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();
        }

        private System.Windows.Forms.MenuStrip MainFormMenu;

        private System.Windows.Forms.ToolStripMenuItem feautreToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem passToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem settingToolStripMenuItem;

        private System.Windows.Forms.Button CloseButton;
        private System.Windows.Forms.Button ConnectButton;
        private System.Windows.Forms.Label ServerUrlLabel;
        private System.Windows.Forms.TextBox urlBox;

        #endregion
    }
}